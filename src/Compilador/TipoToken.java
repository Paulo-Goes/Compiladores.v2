package Compilador;

public enum TipoToken {
    NUM,
    NUM_DEC,
    ID,
    KEYWORD, //Palavra reservada
    TXT,
    OPERADOR,
    SIMBOLO_ESPECIAL,
    COMENTARIO,
    INVALIDO,
    EOF //End of file (Fim do arquivo)
}