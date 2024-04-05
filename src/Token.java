public class Token {
    private tipoToken tipo;
    private String lexema;

    public Token(tipoToken tipo, String lexema) {
        this.tipo = tipo;
        this.lexema = lexema;
    }

    enum tipoToken {
        NUM,
        NUM_DEC,
        ID,
        KEYWORD,
        TXT,
        OPERADOR,
        SIMBOLO_ESPECIAL,
        COMENTARIO,
        INVALIDO
    }

    @Override
    public String toString() {
        return tipo + ": " + lexema;
    }

    public tipoToken getTipo() {
        return tipo;
    }

    public void setTipo(tipoToken tipo) {
        this.tipo = tipo;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }
}