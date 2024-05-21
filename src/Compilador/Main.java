package Compilador;

import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/*
 * Todo: Testar o suporte para MacOS (n sei como)
 *       Análise Sintática
 */

//Ignorar char e ignorar a chamada de funções

public class Main {
    private static final String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy hh-mm-ss"));
    private static final File desktopFolder = new File(FileSystemView.getFileSystemView().getHomeDirectory().toString(), "Compiladores");
    private static final File runFolder = new File(desktopFolder, "Compilação - " + time);

    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
        /*
         * codeEX.txt - um exemplo de um código simples
         * codeProfessor.txt - código que o professor usou para testar o analisador lexico (.length é de proposito para dar erro)
         * training.txt - Alguns exemplos de elementos que conseguem passar, sem fazer parte de um código especifico
         */

        File pastaCodigos = new File("src/codes");
        File[] codigos = pastaCodigos.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

        for(int i = 0; i < Objects.requireNonNull(codigos).length; i++){
            System.out.println((i + 1) +": "+ codigos[i].getName());
        }

        System.out.println("Qual código quer rodar?");

        int sel = new Scanner(System.in).nextInt() - 1;

        createFolder();

        PreProcessamento separador = new PreProcessamento(codigos[sel].toString()); //Pre processamento para a análise léxica

        writePreProcess(separador.getListaString());

        AnalisadorLexico lexico = new AnalisadorLexico();
        lexico.identificador(separador.getListaString()); //Análise léxica é feita

        writeLexic(lexico.getListaToken(), lexico.getListaSimbolos());

        AnalisadorSintatico sintatico = new AnalisadorSintatico(lexico.getListaToken());
        sintatico.parse();

        /* Adicionar os items aqui */

        showFolder();
    }

    private static void writePreProcess(ArrayList<String> listaString) throws IOException {
        BufferedWriter b = new BufferedWriter(new FileWriter(new File(runFolder, "1 Pre-processamento.txt")));

        b.write("Pre-processado\n\n");

        for(String s : listaString){
            b.write(s + "\n");
        }

        b.close();
    }

    private static void writeLexic(ArrayList<Token> tokens, ArrayList<Token> simbolos) throws IOException {
        BufferedWriter bwT = new BufferedWriter(new FileWriter(new File(runFolder, "2 Tokens.txt")));

        bwT.write("Analise Léxica - Tokens\n\n");

        for(Token t : tokens){
            bwT.write(t + "\n");
        }

        bwT.close();

        BufferedWriter bwS = new BufferedWriter(new FileWriter(new File(runFolder, "3 Simbolos.txt")));

        bwS.write("Analise Léxica - Símbolos\n\n");

        for(Token t : simbolos){
            bwS.write(t + "\n");
        }

        bwS.close();
    }

    private static void createFolder() {
        if (!runFolder.exists()) {
            boolean created = runFolder.mkdirs();
            if (created) {
                System.out.println("Pasta criada.");
            } else {
                System.err.println("Não foi possível criar a pasta.");
            }
        } else {
            System.out.println("A pasta já existe.");
        }
    }

    private static void showFolder() throws IOException, InterruptedException, AWTException {
        String so = System.getProperty("os.name").toLowerCase();
        ProcessBuilder pb = getProcessBuilder(so);

        pb.start();

        Thread.sleep(1000);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_WINDOWS);

        System.out.println("Maximizado");
    }

    private static ProcessBuilder getProcessBuilder(String so) {
        ProcessBuilder pb;

        if(so.contains("win")){
            pb = new ProcessBuilder("explorer.exe", runFolder.getAbsolutePath());
        }else if(so.contains("mac")){
            pb = new ProcessBuilder("open", runFolder.getAbsolutePath());
        }else if(so.contains("nix") || so.contains("nux")){
            pb = new ProcessBuilder("xdg-open", runFolder.getAbsolutePath());
        }else{
            throw new UnsupportedOperationException("Sistema operacional não suportado: " + so);
        }
        return pb;
    }
}