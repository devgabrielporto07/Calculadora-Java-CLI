package com.github.devgabrielporto07;
import javax.sound.midi.SoundbankResource;
import java.util.Locale;
import java.util.Scanner;
public class CalculadoraJavaCli {
    // Metódos:
    public static void exibicaoCalculadora() {
        System.out.println("==========================================================");
        System.out.println("|             CALCULADORA-JAVA-TERMINAL                 |");
        System.out.println("|            7         8         9     ( * )            |");
        System.out.println("|            4         5         6     ( - )            |");
        System.out.println("|            1         2         3     ( + )            |");
        System.out.println("|                      0               ( / )            |");
        System.out.println("==========================================================");
    }
    // Funções:
    public static String saudacao (String nome) {
        System.out.printf("Saudações %s!, seja bem-vindo ao um projeto simples que pensei em fazer para contemplar meus estudos. Espero que goste.", nome);
        return nome;
    }
    // Leitura da JVM:
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
        // A ideia do uso de tratamento em java como toUppercase, trim, replace foi mais para aprendizado em si porque se eu quero que o usuário realmente digite da forma JAVA mesmo então era apenas restrição mesmo
        System.out.print("\nDigite seu nome: ");
        String nameUser = scanner.nextLine();
        nameUser = nameUser.toUpperCase().trim();
        System.out.print(AZUL);
        saudacao(nameUser);
        System.out.println(RESET);
        System.out.print("Para que possa prosseguir digite JAVA (de qualquer forma): ");
        String palavraInicializacao = scanner.nextLine();
        palavraInicializacao = palavraInicializacao.toUpperCase().replace(" ", "");
        int tentativaInicializacao = 0;
        if (palavraInicializacao.equals("JAVA")) {
            // Pular o else na checagem da condcional
        }
        else {
            for (tentativaInicializacao = 1; tentativaInicializacao <= 3; tentativaInicializacao++) {
                System.out.print(VERMELHO);
                System.out.printf("Você digitou %s!, para que possa prosseguir digite JAVA (de qualquer forma) (você possui 3 tentativas) (você está com %d) digite abaixo corretamente: ", palavraInicializacao, tentativaInicializacao);
                System.out.println(RESET);
                palavraInicializacao = scanner.nextLine();
                palavraInicializacao = palavraInicializacao.toUpperCase().replace(" ", "");
                if (palavraInicializacao.equals("JAVA")) {
                    break;
                }
                if (tentativaInicializacao >= 3) {
                    System.out.println(VERMELHO + "VOCÊ EXCEDEU O NUMERO DE TENTATIVAS" + RESET);
                    System.out.println(VERDE + "PROGRAMA FINALIZADO!!!" + RESET);
                    System.exit(0);
                    break;
                }
            }
        }
        if (palavraInicializacao.equals("JAVA")) {
            exibicaoCalculadora();
            // Futuras alterações aqui implementação da lógica real
            System.out.print("Qual a operação que você deseja fazer? obs (digite de acordo com os símbolos exibidos na calculadora: ");
            String escolhaOperacao = scanner.next();
        }
        scanner.close();
    }
}