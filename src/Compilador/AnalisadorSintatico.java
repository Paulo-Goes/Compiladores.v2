package Compilador;

import java.util.ArrayList;
import java.util.List;

public class AnalisadorSintatico {
   
    private final List<Token> tokens;
    private int posicaoAtual = 0;

    public AnalisadorSintatico(List<Token> tokens) {
        this.tokens = tokens;
    }

    private Token proximoToken() {
        if (posicaoAtual < tokens.size()) {
            return tokens.get(posicaoAtual);
        }
        return new Token(TipoToken.EOF, "");
    }

    private void conferir(TipoToken esperado) throws Exception {
        if (proximoToken().tipo() == esperado) {
            posicaoAtual++;
        } else {
            throw new Exception("Erro de sintaxe: Esperado " + esperado + " mas encontrado " + proximoToken().tipo());
        }
    }

    public boolean analisar() {
        try {
            // Inicia a análise sintática a partir do ponto de entrada da gramática
            programa();
            
            // Verifica se o final do arquivo foi alcançado
            conferir(TipoToken.EOF);
            
            // Se tudo estiver correto até aqui, retorna verdadeiro
            return true;
        } catch (Exception e) {
            // Se houver qualquer exceção durante a análise, imprime uma mensagem de erro e retorna falso
            System.err.println(e.getMessage());
            return false;
        }
    }

    private void programa() throws Exception {
        while (proximoToken().tipo() != TipoToken.EOF) {
            analisarDeclaracao();
        }
    }

    private void tipo() throws Exception {
        conferir(TipoToken.KEYWORD);
    }

    private void analisarDeclaracaoVariavel() throws Exception {
        tipo();
        conferir(TipoToken.ID);
        if (proximoToken().lexema().equals("=")) {
            conferir(TipoToken.OPERADOR);
            analisarExpressao();
        }
        conferir(TipoToken.SIMBOLO_ESPECIAL);
    }

    private void analisarExpressao() throws Exception {

        if (proximoToken().tipo() == TipoToken.ID) { 
            conferir(TipoToken.ID);
            if (proximoToken().lexema().equals("=") || proximoToken().lexema().matches("[+\\-*/%&|]=")) {
                conferir(TipoToken.OPERADOR);
                analisarExpressao();
            }
        } else if (proximoToken().tipo() == TipoToken.NUM || proximoToken().tipo() == TipoToken.NUM_DEC || proximoToken().tipo() == TipoToken.TXT) {
            conferir(proximoToken().tipo());
        } else {
            throw new Exception("Erro de sintaxe na expressão: " + proximoToken().lexema());
        }
    }
    

    private void analisarDeclaracao() throws Exception {
        // aqui é onde sera implementado aquela logica do ANTLR  
        if (proximoToken().tipo() == TipoToken.KEYWORD) {
            String lexema = proximoToken().lexema();
            if (lexema.equals("int") || lexema.equals("float") || lexema.equals("double") ||
                lexema.equals("char") || lexema.equals("boolean") || lexema.equals("vet")) {
                analisarDeclaracaoVariavel();
            }else if (lexema.equals("struct")) {
                analisarDeclaracaoEstrutura();
            } else if (lexema.equals("if") || lexema.equals("while") || lexema.equals("for") ||
                       lexema.equals("switch") || lexema.equals("break") || lexema.equals("continue") ||
                       lexema.equals("return")) {
                    analisarEstruturaControle();
            } else {
                analisarDeclaracaoFuncao();
            }
        } else if (proximoToken().tipo() == TipoToken.COMENTARIO) {
            analisarComentario();
        } else {
            throw new Exception("Erro de sintaxe na declaração: " + proximoToken().lexema());
        }

    }

    // metodos de verificações que precisa implementar
    private void analisarComentario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'analisarComentario'");
    }

    private void analisarDeclaracaoFuncao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'analisarDeclaracaoFuncao'");
    }

    private void analisarEstruturaControle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'analisarEstruturaControle'");
    }

    private void analisarDeclaracaoEstrutura() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'analisarDeclaracaoEstrutura'");
    }
        
    
}