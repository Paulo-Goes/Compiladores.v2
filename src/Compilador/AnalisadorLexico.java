package Compilador;

import java.util.ArrayList;
import java.util.Objects;

public class AnalisadorLexico {
    private final ArrayList<Token> listaSimbolos;
    private final ArrayList<Token> listaToken;

    public AnalisadorLexico() {
        listaSimbolos = new ArrayList<>();
        listaToken = new ArrayList<>();
    }

    public ArrayList<Token> getListaSimbolos() {
        return listaSimbolos;
    }

    public ArrayList<Token> getListaToken() {
        return listaToken;
    }

    public void identificador(ArrayList<String> lista) {
        for (String lexema : lista) {
            //Palavras reservadas
            if (lexema.matches("\\b(int|float|char|boolean|void|if|else|for|while|scanf|println|main|return)\\b")) {
                listaToken.add(new Token(TipoToken.KEYWORD, lexema));

                //Números inteiros
            } else if (lexema.matches("\\b\\d+\\b")) {
                listaToken.add(new Token(TipoToken.NUM, lexema));

                //Números decimais
            } else if (lexema.matches("\\d+(\\.\\d+)?")) {
                listaToken.add(new Token(TipoToken.NUM_DEC, lexema));

                //Identificadores
            } else if (lexema.matches("[a-zA-Z]+[a-zA-Z0-9_-]*")) {
                boolean add = true;
                int size = listaSimbolos.size();
                for (int i = 0; i < size; i++) {
                    if (Objects.equals(listaSimbolos.get(i).lexema(), lexema)) {
                        add = false;
                        listaToken.add(new Token(TipoToken.ID, String.valueOf(i)));
                        break;
                    }
                }

                if (add) {
                    Token token = new Token(TipoToken.ID, lexema);
                    listaSimbolos.add(token);
                    listaToken.add(new Token(TipoToken.ID, String.valueOf(listaSimbolos.indexOf(token))));
                }

                //Texto
            } else if (lexema.matches("\"[^\"]*[^\"]*\"")) {
                Token token = new Token(TipoToken.TXT, lexema);
                listaSimbolos.add(token);
                listaToken.add(new Token(TipoToken.TXT, String.valueOf(listaSimbolos.indexOf(token))));

                //Comentário de uma ou mais linhas
            } else if (lexema.matches("//.*") || lexema.matches("/\\*.*\\*/")) {
                listaToken.add(new Token(TipoToken.COMENTARIO, lexema));

                //Operadores
            } else if (lexema.matches("=|\\+|-|\\*|/|%|&&|!|>|<|>=|<=|!=|==")) {
                listaToken.add(new Token(TipoToken.OPERADOR, lexema));

                //Símbolos diversos
            } else if (lexema.matches("[\\[\\]{}(),;]")) {
                listaToken.add(new Token(TipoToken.SIMBOLO_ESPECIAL, lexema));
            } else {
                throw new IllegalArgumentException("[" + new Token(TipoToken.INVALIDO, lexema) + "]" + " não é um token aceito");
            }
        }
        listaToken.add(new Token(TipoToken.EOF, "End of file."));
    }
}