package compiladores;
public class Token {
    private tipoToken tipo;
    private String lexema;

    public Token(tipoToken tipo, String lexema) {
        this.tipo = tipo;
        this.lexema = lexema;
    }

    public tipoToken getTipo() {
        return tipo;
    }

    public String getLexema() {
        return lexema;
    }

    enum tipoToken {
        NUM,
        ID,
        KEYWORD,
        TXT,
        OPERADOR,
        SIMBOLO_ESPECIAL,
        COMENTARIO
    }

    @Override
    public String toString() {
        return tipo + ": " + lexema;
    }
}
