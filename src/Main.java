import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Character.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Codigo"));

        ArrayList<String> listaString = new ArrayList<>();

        String linha;
        boolean abreAspas = false;
        boolean abreApostrofe = false;

        while ((linha = reader.readLine()) != null) {

            StringBuilder palavra = null;

            for (int i = 0; i < linha.length(); i++) {
                if (linha.charAt(i) == '"' && !abreApostrofe) {
                    abreAspas = !abreAspas;
                    if (!abreAspas) {
                        palavra.append(linha.charAt(i));
                        listaString.add(palavra.toString());
                        palavra = null;
                    }
                } else if (linha.charAt(i) == '\'' && !abreAspas) {
                    abreApostrofe = !abreApostrofe;
                    if (!abreApostrofe) {
                        listaString.add(palavra.toString());
                        palavra = null;
                    }
                }

                if (abreAspas || abreApostrofe) {
                    if (palavra == null) {
                        palavra = new StringBuilder();
                    }
                    palavra.append(linha.charAt(i));
                } else {
                    // Se for operador
                    if (!isDigit(linha.charAt(i)) && !isAlphabetic(linha.charAt(i)) && !isWhitespace(linha.charAt(i)) && linha.charAt(i) != '.') {
                        if (linha.charAt(i) != '"') {
                            if (palavra != null) {
                                listaString.add(palavra.toString());
                                palavra = null;
                            }
                            listaString.add(Character.toString(linha.charAt(i)));
                        }
                    } else if (!isWhitespace(linha.charAt(i))) {
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