import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Codigo"));

        String s = reader.readLine();

        List<String> palavrasReservadas = Arrays.asList("public", "protected", "private", "class", "static", "void", "boolean", "byte", "short", "int", "long", "float", "double", "char");
        List<String> operadores = Arrays.asList("+", "-", "/", "*", "=", "<", ">", "!");

        /* Pegar a linha
        *  Ler cada caractere até chegar no final de uma palavra
        *  Comparar palavra com uma lista de itens aceitáveis
        *  Adicionar na lista de token ou na tabela de símbolos
        */

    }
}