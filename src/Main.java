import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/*
 * Todo: Testar o suporte para MacOS (n sei como)
 *       Análise Sintática
 */

//Ignorar char e ignorar a chamada de funções

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
        /*
         * codeEX.txt - um exemplo de um código simples
         * codeProfessor.txt - código que o professor usou para testar o analisador lexico (.length é de proposito para dar erro)
         * training.txt - Alguns exemplos de elementos que conseguem passar, sem fazer parte de um código especifico
         */

        File desktop = new File(FileSystemView.getFileSystemView().getHomeDirectory().toString());
        File pasta = new File("src/codes");
        File[] codigos = pasta.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

        for(int i = 0; i < Objects.requireNonNull(codigos).length; i++){
            System.out.println((i + 1) +": "+ codigos[i].getName());
        }

        System.out.println("Qual código quer rodar?");

        int sel = new Scanner(System.in).nextInt() - 1;

        Separador separador = new Separador(codigos[sel].toString()); //Separa o código-fonte em Strings para análise

        AnalisadorLexico analisador = new AnalisadorLexico(desktop);

        analisador.identificador(separador.getListaString()); //Análise léxica é feita


    }
}