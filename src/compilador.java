package compiladores;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
public class compilador {
    public static void main(String[] args) throws Exception {
        String input = "Esta é uma string 123 com várias palavras e 456 números.";
        ArrayList<Token> listaSimbolos = new ArrayList<>();
        ArrayList<Token> listaTokens = new ArrayList<>();
        ArrayList<String> listaIntermediaria = new ArrayList<>();

        String regex = "(?<!\\S)([\\p{L}\\d]+)(?!\\S)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            listaIntermediaria.add(matcher.group());
        }

        Identificador(listaIntermediaria, listaSimbolos, listaTokens);

        System.out.println("Lista de Símbolos:");
        for (Token token : listaSimbolos) {
            System.out.println(token.toString());
        }

        System.out.println("Lista de Tokens: ");
        for (Token token : listaTokens) {
            System.out.println(token.toString());
        }

    }

    private static void Identificador (ArrayList<String> lista, ArrayList<Token> listaSimb, ArrayList<Token> listaToken) {
         for (String lexema : lista) {
            Token token;
            if (lexema.matches("\b(abstract|assert|boolean|break|byte|case|catch|char|class|const|continue|default|do|double|else|enum|extends|final|finally|float|for|goto|if|implements|import|instanceof|int|interface|long|native|new|null|package|private|protected|public|return|short|static|strictfp|super|switch|synchronized|this|throw|throws|transient|try|void|volatile|while)\b")) {
                token = new Token(Token.tipoToken.KEYWORD, lexema);
                listaSimb.add(token);
            } else if (lexema.matches("\\d+(\\.\\d+)?")) {
                token = new Token(Token.tipoToken.NUM, lexema);
                listaToken.add(token);
            } else if(lexema.matches("(\\p{L}+|\\-+)(\\p{L}+|\\-+\\d+)?") ) {
                token = new Token(Token.tipoToken.ID, lexema);
                listaToken.add(token);
            } else if (lexema.matches("\"[^\"]*\"")) {
                token = new Token(Token.tipoToken.TXT, lexema);
                listaToken.add(token);
            } else if (lexema.matches(".*\\+|\\-|\\*|\\/|%|==|!=|<|>|<=|>=|&&|\\|\\||!|&|\\||\\^|\\+=|-=|\\*=|\\/=|%=|<<|>>|>>>|<<=|>>=|>>>=|&=|\\|=|\\^=|instanceof|new")) {
                token = new Token(Token.tipoToken.OPERADOR, lexema);
                listaSimb.add(token);
            }
            else if(lexema.matches("//.*")) {
                token = new Token(Token.tipoToken.COMENTARIO, lexema);
                listaSimb.add(token);
            }
            else if(lexema.matches("[\\[\\]\\{\\}\\(\\)\\,\\;]")) {
                token = new Token(Token.tipoToken.SIMBOLO_ESPECIAL, lexema);
                listaSimb.add(token);
            }
        }
    }
}
