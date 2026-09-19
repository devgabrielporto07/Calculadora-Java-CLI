package com.github.devgabrielporto07;
import java.util.Locale;
import java.util.Scanner;
public class CalculadoraJavaCli {
    // Metódos:
    public static void exibicaoCalculadora () {
        System.out.println("==========================================================");
        System.out.println("|             CALCULADORA-JAVA-TERMINAL                 |");
        System.out.println("|            7         8         9     ( * )            |");
        System.out.println("|            4         5         6     ( - )            |");
        System.out.println("|            1         2         3     ( + )            |");
        System.out.println("|                      0               ( / )            |");
        System.out.println("==========================================================");
    }

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
        // A ideia do uso de tratamento em java como toUppercase, trim, replace foi mais para aprendizado em si porque se eu quero que o usuário realmente digite da forma JAVA mesmo então
        // Tenho que diferenciar cada caractere
        System.out.print("Digite seu nome: ");
        String nameUser = scanner.nextLine();
        nameUser = nameUser.toUpperCase().trim();
        System.out.printf(AMARELO + "Saudações %s!, seja bem-vindo ao um projeto simples que pensei em fazer para contemplar meus estudos. Espero que goste.\n" + RESET, nameUser);
        System.out.print ("Para que possa prosseguir digite JAVA (de qualquer forma): ");
        String palavraInicializacao = scanner.nextLine();
        palavraInicializacao = palavraInicializacao.toUpperCase().replace(" ", "");
        int tentativaInicializacao = 0; // Funcionalidade Futura
        do {
         if (!palavraInicializacao.equals("JAVA")) {
            System.out.println(VERMELHO + "Opção Inválida. Verifique a ortografia. Você digitou: " + RESET + (palavraInicializacao) );
            System.out.print ("Tente novamente digite JAVA: ");
            palavraInicializacao = scanner.nextLine();
            palavraInicializacao = palavraInicializacao.toUpperCase().replace(" ", "");
        }
         if (palavraInicializacao.equals("JAVA")) {
             exibicaoCalculadora();
         }
        } while (!palavraInicializacao.equals("JAVA"));
        scanner.close();
    }
}