import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Codigo2"));

        ArrayList<String> listaString = new ArrayList<>();

        String linha;
        boolean abreAspas = false;
        boolean abreApostrofe = false;

        while ((linha = reader.readLine()) != null) {

            StringBuilder palavra = null;

            for (int i = 0; i < linha.length(); i++) {
                if (linha.charAt(i) == '"' && !abreApostrofe) {
                    abreAspas = !abreAspas;
                } else if (linha.charAt(i) == '\'' && !abreAspas) {
                    abreApostrofe = !abreApostrofe;
                }

                if (abreAspas || abreApostrofe) {
                    if (linha.charAt(i) == '"' || linha.charAt(i) == '\'') {
                        listaString.add(Character.toString(linha.charAt(i)));
                    } else {
                        if (palavra == null) {
                            palavra = new StringBuilder();
                        }
                        palavra.append(linha.charAt(i));
                    }
                } else {
                    // Se for operador ou espaço em branco
                    if (!Character.isDigit(linha.charAt(i)) && !Character.isAlphabetic(linha.charAt(i)) && !Character.isWhitespace(linha.charAt(i))) {
                        if (palavra != null) {
                            listaString.add(palavra.toString());
                            palavra = null;
                        }
                        listaString.add(Character.toString(linha.charAt(i)));
                    } else if (!Character.isWhitespace(linha.charAt(i))) {
                        if (palavra == null) {
                            palavra = new StringBuilder();
                        }
                        palavra.append(linha.charAt(i));
                    } else {
                        if (palavra != null) {
                            listaString.add(palavra.toString());
                            palavra = null;
                        }
                    }
                }
            }

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