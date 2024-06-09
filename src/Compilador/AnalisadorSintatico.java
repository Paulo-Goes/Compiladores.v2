package Compilador;

import java.util.List;
import java.util.Objects;

public class AnalisadorSintatico {

    /*
    * Para o codeC.txt, só existem 2 erros, o char mensagem[] dá erro no '[' (analisarDeclaraçãoVariável) e
    * o println(d) dá erro no '(' (problema deve estar na verificação do TipoToken em analisarDeclaração)
    */

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
        /* Erro aqui
        * char mensagem[] = "Olá, mundo!";
        * Após verificar que mensagem é ID
        * É possível ver que '[' não é '=', fazendo com que a declaração de variável termine de forma prematura
        * Todo: Implementar condição para arrays e matrizes
        */
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
            if (proximoToken().lexema().equals("=") || proximoToken().lexema().matches("=|\\+|-|\\*|/|%|&&|!|>|<|>=|<=|!=|==")) {
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
                if (Objects.equals(tokens.get(posicaoAtual + 1).lexema(), "main")) {
                    analisarDeclaracaoFuncao();
                } else {
                    analisarDeclaracaoVariavel();
                }
            } else if (lexema.equals("struct")) {
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
    private void analisarComentario() throws Exception {
        conferir(TipoToken.COMENTARIO);
    }


    private void analisarBloco() throws Exception {
        conferir(TipoToken.SIMBOLO_ESPECIAL); // '{'
        while (proximoToken().tipo() != TipoToken.SIMBOLO_ESPECIAL) {
            analisarDeclaracao();
        }
        conferir(TipoToken.SIMBOLO_ESPECIAL); // '}'
    }


    private void analisarParametro() throws Exception {
        tipo();
        conferir(TipoToken.ID);
        if (proximoToken().lexema().equals("[")) {
            conferir(TipoToken.SIMBOLO_ESPECIAL);
            conferir(TipoToken.SIMBOLO_ESPECIAL); // ']'
        }
    }

    private void analisarDeclaracaoFuncao() throws Exception {
        tipo();
        if (Objects.equals(proximoToken().lexema(), "main")) {
            tipo();
        } else {
            conferir(TipoToken.ID);
        }
        conferir(TipoToken.SIMBOLO_ESPECIAL); // '('
        if (proximoToken().tipo() != TipoToken.SIMBOLO_ESPECIAL) {
            analisarParametros();
        }
        conferir(TipoToken.SIMBOLO_ESPECIAL); // ')'
        analisarBloco();
    }

    private void analisarParametros() throws Exception {
        analisarParametro();
        while (proximoToken().lexema().equals(",")) {
            conferir(TipoToken.OPERADOR);
            analisarParametro();
        }
    }

    // aqui pedi uma ajudinha para ter como base ñ sei se está completo ou incorreto verificar com atenção

    private void analisarEstruturaControle() throws Exception {
        String lexema = proximoToken().lexema();
        if (lexema.equals("if")) {
            conferir(TipoToken.KEYWORD);
            conferir(TipoToken.SIMBOLO_ESPECIAL); // '('
            analisarExpressao();
            conferir(TipoToken.SIMBOLO_ESPECIAL); // ')'
            analisarBloco();
            if (proximoToken().lexema().equals("else")) {
                conferir(TipoToken.KEYWORD);
                analisarBloco();
            }
        } else if (lexema.equals("while")) {
            conferir(TipoToken.KEYWORD);
            conferir(TipoToken.SIMBOLO_ESPECIAL); // '('
            analisarExpressao();
            conferir(TipoToken.SIMBOLO_ESPECIAL); // ')'
            analisarBloco();
        } else if (lexema.equals("for")) {
            conferir(TipoToken.KEYWORD);
            conferir(TipoToken.SIMBOLO_ESPECIAL); // '('
            analisarExpressao();
            conferir(TipoToken.SIMBOLO_ESPECIAL); // ';'
            analisarExpressao();
            conferir(TipoToken.SIMBOLO_ESPECIAL); // ';'
            analisarExpressao();
            conferir(TipoToken.SIMBOLO_ESPECIAL); // ')'
            analisarBloco();
        } else if (lexema.equals("switch")) {
            conferir(TipoToken.KEYWORD);
            conferir(TipoToken.SIMBOLO_ESPECIAL); // '('
            analisarExpressao();
            conferir(TipoToken.SIMBOLO_ESPECIAL); // ')'
            analisarListaCase();
        } else if (lexema.equals("break")) {
            conferir(TipoToken.KEYWORD);
            conferir(TipoToken.SIMBOLO_ESPECIAL); // ';'
        } else if (lexema.equals("continue")) {
            conferir(TipoToken.KEYWORD);
            conferir(TipoToken.SIMBOLO_ESPECIAL); // ';'
        } else if (lexema.equals("return")) {
            conferir(TipoToken.KEYWORD);
            analisarExpressao();
            conferir(TipoToken.SIMBOLO_ESPECIAL); // ';'
        } else {
            throw new Exception("Estrutura de controle desconhecida: " + lexema);
        }
    }

    private void analisarListaCase() throws Exception {
        while (proximoToken().lexema().equals("case") || proximoToken().lexema().equals("default")) {
            analisarDeclaracaoCase();
        }
    }

    private void analisarDeclaracaoCase() throws Exception {
        if (proximoToken().lexema().equals("case")) {
            conferir(TipoToken.KEYWORD);
            analisarExpressao();
            conferir(TipoToken.SIMBOLO_ESPECIAL); // ':'
            analisarBloco();
        } else if (proximoToken().lexema().equals("default")) {
            conferir(TipoToken.KEYWORD);
            conferir(TipoToken.SIMBOLO_ESPECIAL); // ':'
            analisarBloco();
        } else {
            throw new Exception("Declaração de case desconhecida: " + proximoToken().lexema());
        }
    }

    private void analisarDeclaracaoEstrutura() throws Exception {
        conferir(TipoToken.KEYWORD); // 'struct'
        conferir(TipoToken.ID);
        conferir(TipoToken.SIMBOLO_ESPECIAL); // '{'
        while (proximoToken().tipo() == TipoToken.KEYWORD) {
            analisarDeclaracaoVariavel();
        }
        conferir(TipoToken.SIMBOLO_ESPECIAL); // '}'
        conferir(TipoToken.SIMBOLO_ESPECIAL); // ';'
    }
}