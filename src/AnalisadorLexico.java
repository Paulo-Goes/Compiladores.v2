import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class AnalisadorLexico {
    private final ArrayList<Token> listaSimbolos;
    private final ArrayList<Token> listaToken;
    private final File desktop;

    public AnalisadorLexico(File desktop){
        listaSimbolos = new ArrayList<>();
        listaToken = new ArrayList<>();
        this.desktop = desktop;
    }

    public ArrayList<Token> getListaSimbolos() {
        return listaSimbolos;
    }

    public ArrayList<Token> getListaToken() {
        return listaToken;
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

    public static void showFolder(File subFolder) throws IOException, InterruptedException, AWTException {
        String so = System.getProperty("os.name").toLowerCase();
        ProcessBuilder pb = getProcessBuilder(subFolder, so);

        pb.start();

        Thread.sleep(1000);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_WINDOWS);

        System.out.println("Maximizado");
    }

    private static ProcessBuilder getProcessBuilder(File subFolder, String so) {
        ProcessBuilder pb;

        if(so.contains("win")){
            pb = new ProcessBuilder("explorer.exe", subFolder.getAbsolutePath());
        }else if(so.contains("mac")){
            pb = new ProcessBuilder("open", subFolder.getAbsolutePath());
        }else if(so.contains("nix") || so.contains("nux")){
            pb = new ProcessBuilder("xdg-open", subFolder.getAbsolutePath());
        }else{
            throw new UnsupportedOperationException("Sistema operacional não suportado: " + so);
        }
        return pb;
    }

    public void identificador(ArrayList<String> lista) throws IOException, InterruptedException, AWTException {
        for (String lexema : lista) {
            //Palavras reservadas
            if (lexema.matches("\\b(abstract|assert|boolean|break|byte|case|catch|char|class|const|continue|default|do|double|else|enum|extends|final|finally|float|for|goto|if|implements|import|instanceof|int|interface|long|main|native|new|null|package|private|protected|println|public|return|scanf|short|static|strictfp|super|switch|synchronized|this|throw|throws|transient|try|void|volatile|while)\\b")) {
                listaToken.add(new Token(TipoToken.KEYWORD, lexema));

                //Números inteiros
            } else if(lexema.matches("\\b\\d+\\b")){
                listaToken.add(new Token(TipoToken.NUM, lexema));

                //Números decimais
            } else if (lexema.matches("\\d+(\\.\\d+)?")) {
                listaToken.add(new Token(TipoToken.NUM_DEC, lexema));

                //Identificadores
            } else if (lexema.matches("[a-zA-Z]+[a-zA-Z0-9_-]*")) {
                Token token = new Token(TipoToken.ID, lexema);
                listaSimbolos.add(token);
                listaToken.add(new Token(TipoToken.SIMBOLO_PONTEIRO, String.valueOf(listaSimbolos.indexOf(token))));

                //Texto
            } else if (lexema.matches("\"[^\"]*[^\"]*\"")) {
                Token token = new Token(TipoToken.TXT, lexema);
                listaSimbolos.add(token);
                listaToken.add(new Token(TipoToken.SIMBOLO_PONTEIRO, String.valueOf(listaSimbolos.indexOf(token))));

                //Comentário de uma ou mais linhas
            } else if (lexema.matches("//.*") || lexema.matches("/\\*.*\\*/")) {
                listaToken.add(new Token(TipoToken.COMENTARIO, lexema));

                //Operadores
            } else if (lexema.matches(".*[+\\-*/%=!<>&|^]=?")) {
                listaToken.add(new Token(TipoToken.OPERADOR, lexema));

                //Símbolos diversos
            } else if (lexema.matches("[\\[\\]{}(),;]")) {
                listaToken.add(new Token(TipoToken.SIMBOLO_ESPECIAL, lexema));
            } else {
                throw new IllegalArgumentException("[" + new Token(TipoToken.INVALIDO, lexema) + "]" + " não é um token aceito");
            }
        }
        listaToken.add(new Token(TipoToken.EOF, ""));

        File folder = new File(desktop, "Analisador Léxico");
        createFolder(folder);

        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy hh-mm-ss"));

        File tokens = new File(folder, "Tokens " + time + ".txt");
        File simbolos = new File(folder, "Símbolos " + time + ".txt");

        BufferedWriter writerToken = new BufferedWriter(new FileWriter(tokens));
        BufferedWriter writerSimbolo = new BufferedWriter(new FileWriter(simbolos));

        writerToken.write("Tokens\n\n");
        writerSimbolo.write("Símbolos\n\n");

        for (Token token : listaToken) {
            writerToken.write(token + "\n");
        }

        int aux = 0;

        for (Token listaSimbolo : listaSimbolos) {
            writerSimbolo.write(aux + " " + listaSimbolo + "\n");
            aux++;
        }

        writerToken.close();
        writerSimbolo.close();

        showFolder(folder);
    }
}