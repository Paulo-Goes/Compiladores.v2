package Compilador;

public enum TipoToken {
    NUM,
    NUM_DEC,
    ID,
    KEYWORD,
    TXT,
    OPERADOR,
    SIMBOLO_ESPECIAL,
    COMENTARIO,
    INVALIDO,
    EOF //Fim do arquivo (fim da análise léxica), aparece no final da lista de tokens
}