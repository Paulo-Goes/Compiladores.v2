import java.util.ArrayList;

public class AnalisadorLexico {
    private final ArrayList<Token> listaSimbolos;
    private final ArrayList<Token> listaToken;

    public AnalisadorLexico(){
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
            if (lexema.matches("\\b(abstract|assert|boolean|break|byte|case|catch|char|class|const|continue|default|do|double|else|enum|extends|final|finally|float|for|goto|if|implements|import|instanceof|int|interface|long|main|native|new|null|package|private|protected|println|public|return|scanf|short|static|strictfp|super|switch|synchronized|this|throw|throws|transient|try|void|volatile|while)\\b")) {
                listaToken.add(new Token(TipoToken.KEYWORD, lexema));

                //Números inteiros
            } else if(lexema.matches("\\b\\d+\\b")){
                listaToken.add(new Token(TipoToken.NUM, lexema));

                //Números decimais
            } else if (lexema.matches("\\d+(\\.\\d+)?")) {
                listaToken.add(new Token(TipoToken.NUM_DEC, lexema));

                //Identificadores
            } else if (lexema.matches("[a-zA-Z]+[a-zA-Z0-9_-]*")) {
                Token token = new Token(TipoToken.ID, lexema);
                listaSimbolos.add(token);
                listaToken.add(new Token(TipoToken.SIMBOLO_PONTEIRO, String.valueOf(listaSimbolos.indexOf(token))));

                //Texto
            } else if (lexema.matches("\"[^\"]*[^\"]*\"")) {
                Token token = new Token(TipoToken.TXT, lexema);
                listaSimbolos.add(token);
                listaToken.add(new Token(TipoToken.SIMBOLO_PONTEIRO, String.valueOf(listaSimbolos.indexOf(token))));

                //Comentário de uma ou mais linhas
            } else if (lexema.matches("//.*") || lexema.matches("/\\*.*\\*/")) {
                listaToken.add(new Token(TipoToken.COMENTARIO, lexema));

                //Operadores
            } else if (lexema.matches(".*[+\\-*/%=!<>&|^]=?")) {
                listaToken.add(new Token(TipoToken.OPERADOR, lexema));

                //Símbolos diversos
            } else if (lexema.matches("[\\[\\]{}(),;]")) {
                listaToken.add(new Token(TipoToken.SIMBOLO_ESPECIAL, lexema));
            } else {
                throw new IllegalArgumentException("[" + new Token(TipoToken.INVALIDO, lexema) + "]" + " não é um token aceito");
            }
        }
        listaToken.add(new Token(TipoToken.EOF, ""));
    }
}