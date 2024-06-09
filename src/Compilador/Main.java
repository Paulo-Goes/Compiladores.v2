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
 *       Análise Semântica
 */

//Ignorar char e ignorar a chamada de funções

public class Main {
    private static final String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy hh-mm-ss"));
    private static final File desktopFolder = new File(FileSystemView.getFileSystemView().getHomeDirectory().toString(), "Compiladores");
    private static final File runFolder = new File(desktopFolder, "Compilação - " + time);

    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
        File pastaCodigos = new File("src/codes");
        File[] codigos = pastaCodigos.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

        //1 = true, 0 = false
        System.out.println("Criar pasta e arquivos de saída? 1/0 (true/false)");

        //Se a entrada do scanner for 1, então ele cria os arquivos na pasta na área de trabalho
        boolean criar = new Scanner(System.in).nextInt() == 1;

        if(criar){
            System.out.println("Arquivos de saída serão criados após a execução completa desse código.");
        }else{
            System.out.println("Arquivos de saída não serão criados.");
        }

        for (int i = 0; i < Objects.requireNonNull(codigos).length; i++) {
            System.out.println((i + 1) + ": " + codigos[i].getName());
        }

        System.out.println("Qual código quer rodar?");

        int sel = new Scanner(System.in).nextInt() - 1;

        PreProcessamento separador = new PreProcessamento(codigos[sel].toString()); //Pre processamento para a análise léxica

        AnalisadorLexico lexico = new AnalisadorLexico();
        lexico.identificador(separador.getListaString()); //Análise léxica é feita

        AnalisadorSintatico sintatico = new AnalisadorSintatico(lexico.getListaToken());

        if(sintatico.analisar()){
            System.out.println(codigos[sel].getName() + " foi analisado com sucesso!");
        }else{
            System.out.println(codigos[sel].getName() + " não foi analisado com sucesso.");
        }

        if (criar) {
            createFolder();
            writePreProcess(separador.getListaString());
            writeLexic(lexico.getListaToken(), lexico.getListaSimbolos());
            showFolder();
        }
    }

    private static void writePreProcess(ArrayList<String> listaString) throws IOException {
        BufferedWriter b = new BufferedWriter(new FileWriter(new File(runFolder, "1 Pre-processamento.txt")));

        b.write("Pre-processado\n\n");

        for (String s : listaString) {
            b.write(s + "\n");
        }

        b.close();
    }

    private static void writeLexic(ArrayList<Token> tokens, ArrayList<Token> simbolos) throws IOException {
        BufferedWriter bwT = new BufferedWriter(new FileWriter(new File(runFolder, "2 Tokens.txt")));

        bwT.write("Analise Léxica - Tokens\n\n");

        for (Token t : tokens) {
            bwT.write(t + "\n");
        }

        bwT.close();

        BufferedWriter bwS = new BufferedWriter(new FileWriter(new File(runFolder, "3 Simbolos.txt")));

        bwS.write("Analise Léxica - Símbolos\n\n");

        int i = 0;
        for (Token t : simbolos) {
            bwS.write(i + ": " + t + "\n");
            i++;
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

        if (so.contains("win")) {
            pb = new ProcessBuilder("explorer.exe", runFolder.getAbsolutePath());
        } else if (so.contains("mac")) {
            pb = new ProcessBuilder("open", runFolder.getAbsolutePath());
        } else if (so.contains("nix") || so.contains("nux")) {
            pb = new ProcessBuilder("xdg-open", runFolder.getAbsolutePath());
        } else {
            throw new UnsupportedOperationException("Sistema operacional não suportado: " + so);
        }
        return pb;
    }
}