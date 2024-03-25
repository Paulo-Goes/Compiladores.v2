import java.util.ArrayList;
public class compilador {

    public void Identificador (ArrayList<String> lista) { //recebe uma lista de lexemas
        ArrayList<Token> listaSimbolos = new ArrayList<>();
        ArrayList<Token> listaToken = new ArrayList<>();

         for (String lexema : lista) {
            Token token;
            if (lexema.matches("\b(abstract|assert|boolean|break|byte|case|catch|char|class|const|continue|default|do|double|else|enum|extends|final|finally|float|for|goto|if|implements|import|instanceof|int|interface|long|native|new|null|package|private|protected|public|return|short|static|strictfp|super|switch|synchronized|this|throw|throws|transient|try|void|volatile|while)\b")) {
                token = new Token(Token.tipoToken.KEYWORD, lexema);
                listaSimbolos.add(token);
            } else if (lexema.matches("\\d+(\\.\\d+)?")) {
                token = new Token(Token.tipoToken.NUM, lexema);
                listaToken.add(token);
            } else if(lexema.matches("(\\p{L}+|\\-+)(\\p{L}+|\\-+\\d+)?") ) {
                token = new Token(Token.tipoToken.ID, lexema);
                listaToken.add(token);
            } else if (lexema.matches("\"[^\"]*\"")) {
                token = new Token(Token.tipoToken.TXT, lexema);
                listaToken.add(token);
            } else if (lexema.matches(".*\\+|\\-|\\*|\\/|%|==|!=|<|>|<=|>=|&&|\\|\\||!|&|\\||\\^|\\+=|-=|\\*=|\\/=|%=|<<|>>|>>>|<<=|>>=|>>>=|&=|\\|=|\\^=")) {
                token = new Token(Token.tipoToken.OPERADOR, lexema);
                listaSimbolos.add(token);
            }
            else if(lexema.matches("//.*")) {
                token = new Token(Token.tipoToken.COMENTARIO, lexema);
                listaSimbolos.add(token);
            }
            else if(lexema.matches("[\\[\\]\\{\\}\\(\\)\\,\\;]")) {
                token = new Token(Token.tipoToken.SIMBOLO_ESPECIAL, lexema);
                listaSimbolos.add(token);
            }
            else {
                token = new Token(Token.tipoToken.INVALIDO, lexema);
                break;
            }
        }
    }
}

