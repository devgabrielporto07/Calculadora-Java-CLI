package com.github.devgabrielporto07;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {  // Leitura da JVM:
        Scanner scanner = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        String nome = Nome.lerNome(scanner);
        Saudacao.saudacao(nome);
        boolean palavraValida = PalavraInicializacao.validarPalavra(scanner);
        if (palavraValida) {
            ExibicaoCalculadora.exibicaoCalculadora();
            System.out.println("Digite + para somar");
            System.out.println("Digite - para subtrair");
            System.out.println("Digite * para multiplicar");
            System.out.println("Digite / para dividir");
            System.out.print("Escolha de acordo com o menu acima digite ao lado o simbolo: ");
            String operacao = scanner.nextLine();
            System.out.print("Digite quantos números voce vai querer usar de acordo com a escolha da operação: ");
            int quantidadeNumeros = scanner.nextInt();
            System.out.println(Cores.VERMELHO +"Obs: De acordo com a operação escolhida serão feitas com os números em ordem digitada" + Cores.RESET);
            if (quantidadeNumeros > 0) {
                double[] numeros = new double[quantidadeNumeros];
                for (int loop = 0; loop < quantidadeNumeros; loop++) {
                    System.out.printf("Digite o número %d°: ", loop + 1);
                    numeros[loop] = scanner.nextDouble();
                }
            }
            else {
                System.out.println(Cores.VERMELHO + "Digite uma quantidade maior que zero, Erro, programa encerrado!!!" + Cores.RESET);
                System.exit(0);
            }
        }
        scanner.close();
    }
}