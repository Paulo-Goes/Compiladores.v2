import javax.swing.filechooser.FileSystemView;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class Compilador {

    public void identificador(ArrayList<String> lista) throws IOException { //recebe uma lista de lexemas
        ArrayList<Token> listaSimbolos = new ArrayList<>();
        ArrayList<Token> listaToken = new ArrayList<>();

        for (String lexema : lista) {
            Token token;
            if (lexema.matches("\\b(abstract|assert|boolean|break|byte|case|catch|char|class|const|continue|default|do|double|else|enum|extends|final|finally|float|for|goto|if|implements|import|instanceof|int|interface|long|native|new|null|package|private|protected|public|return|short|static|strictfp|super|switch|synchronized|this|throw|throws|transient|try|void|volatile|while)\\b")) {
                token = new Token(Token.tipoToken.KEYWORD, lexema);
                listaSimbolos.add(token);
            } else if (lexema.matches("\\d+(\\.\\d+)?")) {
                token = new Token(Token.tipoToken.NUM, lexema);
                listaToken.add(token);
            } else if (lexema.matches("[a-zA-Z]+[a-zA-Z0-9_-]*")) {
                token = new Token(Token.tipoToken.ID, lexema);
                listaToken.add(token);
            } else if (lexema.matches("\"[^\"]*\"")) {
                token = new Token(Token.tipoToken.TXT, lexema);
                listaToken.add(token);
            } else if (lexema.matches(".*[+\\-*/%==!=<><=><&|!^+=\\-*/%<<>>>>>]=?")) {
                token = new Token(Token.tipoToken.OPERADOR, lexema);
                listaSimbolos.add(token);
            } else if (lexema.matches("//.*")) {
                token = new Token(Token.tipoToken.COMENTARIO, lexema);
                listaSimbolos.add(token);
            } else if (lexema.matches("[\\[\\]\\{\\}\\(\\),;]")) {
                token = new Token(Token.tipoToken.SIMBOLO_ESPECIAL, lexema);
                listaSimbolos.add(token);
            } else {
                token = new Token(Token.tipoToken.INVALIDO, lexema);

            }
        }
        File desktop = new File(FileSystemView.getFileSystemView().getHomeDirectory().toString());
        File folder = new File(desktop, "Analisador Léxico");
        createFolder(folder);

        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy hh-mm-ss"));

        File tokens = new File(folder, "Tokens " + time + ".txt");
        File simbolos = new File(folder, "Simbolos " + time +".txt");

        BufferedWriter writerToken = new BufferedWriter(new FileWriter(tokens));
        BufferedWriter writerSimbolo = new BufferedWriter(new FileWriter(simbolos));

        writerToken.write("Tokens");
        writerSimbolo.write("Simbolos");

        for (Token token : listaToken) {
            writerToken.write(String.valueOf(token));
        }

        for (Token listaSimbolo : listaSimbolos) {
            writerSimbolo.write(String.valueOf(listaSimbolo));
        }

        writerToken.close();
        writerSimbolo.close();
    }

    private static void createFolder(File folder) {
        if (!folder.exists()) {
            boolean created = folder.mkdirs();
            if (created) {
                System.out.println("Pasta criada.");
            } else {
                System.err.println("Não foi possível criar a pasta.");
            }
        } else {
            System.out.println("A pasta já existe.");
        }
    }
}