package com.github.devgabrielporto07;
import java.util.Locale;
import java.util.Scanner;
public class CalculadoraJavaCli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        // Definindo as cores para estilização no terminal:
        final String RESET = "\u001B[0m";
        final String VERMELHO = "\u001B[31m";
        final String VERDE = "\u001B[32m";
        final String AMARELO = "\u001B[33m";
        final String AZUL = "\u001B[34m";
        // Idealização de uma calculadora (Saídas para exibição) + palavra-chave para Inicialização junto com alguns métodos java:
        System.out.print("Digite seu nome: ");
        String nameUser = scanner.nextLine();
        nameUser = nameUser.toUpperCase().trim();
        System.out.printf(AMARELO + "Saudações %s!, seja bem-vindo ao um projeto simples que pensei em fazer para contemplar meus estudos. Espero que goste.\n" + RESET, nameUser);
        System.out.print ("Para que possa prosseguir digite Java: ");
        String palavraInicializacao = scanner.nextLine();
        palavraInicializacao = palavraInicializacao.toUpperCase().replace(" ", "");
        if (palavraInicializacao.equals("JAVA")) {
            System.out.println("==========================================================");
            System.out.println("|             CALCULADORA-JAVA-TERMINAL                 |");
            System.out.println("|            7         8         9     ( * )            |");
            System.out.println("|            4         5         6     ( - )            |");
            System.out.println("|            1         2         3     ( + )            |");
            System.out.println("|                      0               ( / )            |");
            System.out.println("==========================================================");

        }
        else {
            System.out.println(VERMELHO + "Opção Inválida. Verifique a ortografia. Você digitou: " + RESET + (palavraInicializacao) + VERMELHO + "!!! Renicie o sistema e tente novamente" + RESET);
        }
        scanner.close();
    }
}