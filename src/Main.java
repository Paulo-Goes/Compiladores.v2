import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Codigo")); //Lê o arquivo com o codigo fonte

        List<String> listaString = new ArrayList<>();

        String linha;

        while ((linha = reader.readLine()) != null) {

            StringBuilder palavra = null;

            /*
             * O codigo vai adicionar palavras a uma lista de String
             * No momento considera-se que se o char verificado for um espaco em branco, a palavra terminou e será colocada na lista
             */

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
    }
}