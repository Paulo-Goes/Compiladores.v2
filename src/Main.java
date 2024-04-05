import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Character.*;

/*
 * Todo: Resolver problemas com comentários de várias linhas saindo como operador em vez de comentário
 *       Em CodigoProfessor.txt, na linha 29, especificamente 'valores.length', o '.' não é reconhecido
 *       Adicionar argumento para que '(texto)' seja reconhecido junto como "(texto)"
 *       Fazer o analisador retornar um ID especial para apontar para um elemento na lista de simbolos para a lista de tokens (criar um Token especifico?)
 *       Adicionar suporte para Linux e MacOS (Gerenciar Desktop)
 *       Fazer o codigo abrir a pasta no final da execução ou talvez ja abrir os dois arquivos gerados lado a lado
 */

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * Codigo.txt - um exemplo de um codigo simples
         * CodigoProfessor.txt - codigo que o professor usou para testar o analizador lexico
         * Treino.txt - Alguns exemplos de elementos que conseguem passar, sem fazer parte de um codigo especifico
         */
        BufferedReader reader = new BufferedReader(new FileReader("CodigoProfessor.txt"));

        ArrayList<String> listaString = new ArrayList<>();

        String linha;
        StringBuilder palavra = new StringBuilder();

        boolean abreAspas = false;
        boolean abreApostrofe = false;
        boolean isNum = false;
        boolean isSingleComment = false;
        boolean isMultiComment = false;
        boolean isReserved = false;
        boolean checkComment = false;
        boolean checkEndComment = false;

        while ((linha = reader.readLine()) != null) {
            if (isSingleComment) {
                listaString.add(palavra.toString());
                palavra = new StringBuilder();
                isSingleComment = false;
            }

            for (int i = 0; i < linha.length(); i++) {
                char c = linha.charAt(i);

                if (abreAspas || abreApostrofe) {
                    palavra.append(c);
                } else if (isNum) {
                    if (isDigit(c) || c == '.') {
                        palavra.append(c);
                    } else {
                        listaString.add(palavra.toString());
                        palavra = new StringBuilder();
                        isNum = false;
                    }
                } else if (isReserved) {
                    if (isDigit(c) || isAlphabetic(c)) {
                        palavra.append(c);
                    } else {
                        listaString.add(palavra.toString());
                        palavra = new StringBuilder();
                        isReserved = false;
                    }
                } else if (isSingleComment) {
                    palavra.append(c);
                } else if (isMultiComment) {
                    palavra.append(c);
                    if (checkEndComment) {
                        if (c == '/') {
                            listaString.add(palavra.toString());
                            palavra = new StringBuilder();
                            isMultiComment = false;
                        }
                    }

                    if (c == '*') {
                        checkEndComment = true;
                    }
                }

                if (!isDigit(c) && !isAlphabetic(c)) { //Se for algum tipo de simbolo
                    if (c == '"') {
                        if (!isSingleComment && !isMultiComment && !abreApostrofe) {
                            if (abreAspas) {
                                listaString.add(palavra.toString());
                                palavra = new StringBuilder();
                                abreAspas = false;
                            } else {
                                abreAspas = true;
                                palavra.append(c);
                            }
                        }
                    } else if (c == '\'') {
                        if (!isSingleComment && !isMultiComment && !abreAspas) {
                            if (abreApostrofe) {
                                listaString.add(palavra.toString());
                                palavra = new StringBuilder();
                                abreApostrofe = false;
                            } else {
                                abreApostrofe = true;
                                palavra.append(c);
                            }
                        }
                    } else if (c == '/' || checkComment && !isSingleComment && !isMultiComment) {
                        if (!checkEndComment) {
                            if (!checkComment) {
                                palavra.append(c);
                                checkComment = true;
                            } else {
                                if (c == '/') {
                                    palavra.append(c);
                                    isSingleComment = true;
                                    checkComment = false;
                                } else if (c == '*') {
                                    palavra.append(c);
                                    isMultiComment = true;
                                    checkComment = false;
                                } else {
                                    listaString.add(palavra.toString());
                                    palavra = new StringBuilder();
                                    checkComment = false;
                                }
                            }
                        } else {
                            checkEndComment = false;
                        }
                    } else if (!isWhitespace(c) && !isSingleComment && !isMultiComment && !isNum) {
                        if (!abreAspas && !abreApostrofe) {
                            palavra.append(c);
                            listaString.add(palavra.toString());
                            palavra = new StringBuilder();
                        }
                    }
                } else if (isDigit(c) && !isReserved) {
                    if (!isSingleComment && !isMultiComment && !abreAspas && !abreApostrofe) {
                        if (!isNum) {
                            isNum = true;
                            palavra.append(c);
                        }
                    }
                } else if (isAlphabetic(c)) {
                    if (!isSingleComment && !isMultiComment && !abreAspas && !abreApostrofe) {
                        if (!isReserved) {
                            palavra.append(c);
                            isReserved = true;
                        }
                    }
                }
            }
        }

        reader.close();

        for (String s : listaString) {
            System.out.println(s);
        }

        Compilador compilador = new Compilador();
        compilador.identificador(listaString);
    }
}