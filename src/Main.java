import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Codigo"));

        ArrayList<String> listaString = new ArrayList<>();

        String linha;

        while ((linha = reader.readLine()) != null) {

            StringBuilder palavra = null;

            for (int i = 0; i < linha.length(); i++) {
                if (linha.charAt(i) == ' ') {
                    if (palavra != null) {
                        listaString.add(palavra.toString());
                    }
                    palavra = null;
                } else {
                    if (palavra == null) {
                        palavra = new StringBuilder();
                    }
                    palavra.append(linha.charAt(i));
                }
            }
            //Adiciona a ultima palavra da linha
            if (palavra != null) {
                listaString.add(palavra.toString());
            }
        }
        for (String s : listaString) {
            System.out.println(s);
        }

        Compilador compilador = new Compilador();
        compilador.identificador(listaString);
    }
}