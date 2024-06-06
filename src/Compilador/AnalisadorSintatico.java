package Compilador;

import java.util.ArrayList;

public class AnalisadorSintatico {
    private Token currentToken;
    private int i;
    private final ArrayList<Token> lista;

    public AnalisadorSintatico(ArrayList<Token> listaToken) {
        currentToken = listaToken.get(i);
        lista = listaToken;
        parse();
    }

    private void eat(TipoToken tipo) {
        if (currentToken.tipo() == tipo) {
            getNext();
        } else {
            throw new RuntimeException("Erro de sintaxe: esperava " + tipo + " mas encontrou " + currentToken.tipo());
        }
    }

    public void parse() {
        programa();
    }

    private void programa() {
        // Programa -> Declaracao
        while (currentToken.tipo() != TipoToken.EOF) {
            declaracao();
        }
    }

    private void declaracao() {

        /*if(currentToken.tipo() == TipoToken.KEYWORD){
            System.out.println(currentToken.lexema() + " é uma palavra chave");
        }*/



        // Declaracao -> DeclaracaoVariavel
        if (currentToken.tipo() == TipoToken.KEYWORD && isTipo(currentToken.lexema())) {
            eat(TipoToken.KEYWORD);
            if (currentToken.tipo() == TipoToken.ID) {
                eat(TipoToken.ID);
                if (currentToken.tipo() == TipoToken.SIMBOLO_ESPECIAL && currentToken.lexema().equals(";")) {
                    eat(TipoToken.SIMBOLO_ESPECIAL);
                } else if (currentToken.tipo() == TipoToken.OPERADOR && currentToken.lexema().equals("=")) {
                    eat(TipoToken.OPERADOR);
                    expressao();
                    eat(TipoToken.SIMBOLO_ESPECIAL);
                }
            }
        } else if (currentToken.tipo() == TipoToken.COMENTARIO) {
            eat(TipoToken.COMENTARIO);
        } else {
            throw new RuntimeException("Erro de sintaxe em declaração: " + currentToken.lexema());
        }
    }

    private boolean isTipo(String lexema) {
        return lexema.equals("int") || lexema.equals("float") || lexema.equals("double") || lexema.equals("char") || lexema.equals("boolean") || lexema.equals("main");
    }

    private void expressao() {
        atribuicao();
    }

    private void atribuicao() {
        if (currentToken.tipo() == TipoToken.ID) {
            eat(TipoToken.ID);
            if (currentToken.tipo() == TipoToken.OPERADOR) {
                eat(TipoToken.OPERADOR);
                expressao();
            }
        } else {
            throw new RuntimeException("Erro de sintaxe em atribuição: " + currentToken.lexema());
        }
    }

    private void getNext(){
        currentToken = lista.get(i++);
    }
}