package Compilador;

public enum TipoToken {
    NUM, //Números inteiros
    NUM_DEC, //Números decimais
    ID, //identificadores
    KEYWORD, //Palavra reservada
    TXT, //Texto
    OPERADOR, //Operadores
    SIMBOLO_ESPECIAL, //Símbolos especiais como ';' '{' '}' etc...
    COMENTARIO, //Comentários
    INVALIDO, //Nenhum dos tipos acima
    EOF //End of file (Fim do arquivo)
}