package com.github.devgabrielporto07;
import java.util.Scanner;
public class PalavraInicializacao {
    public static boolean validarPalavra(Scanner scanner) {
        // A ideia do uso de tratamento em java como toUppercase, trim, replace foi mais para aprendizado em si porque se eu quero que o usuário realmente digite da forma JAVA mesmo então era apenas restrição mesmo
        System.out.print("Para que possa prosseguir digite JAVA (de qualquer forma): ");
        String palavraInicializacao = scanner.nextLine();
        palavraInicializacao = palavraInicializacao.toUpperCase().replace(" ", "");
        int tentativaInicializacao;
        if (palavraInicializacao.equals("JAVA")) {
            // Pular o else na checagem da condicional
            return true;
        } else {
            for (tentativaInicializacao = 2; tentativaInicializacao <= 3; tentativaInicializacao++) {
                System.out.print(Cores.VERMELHO);
                System.out.printf("Você digitou %s!, para que possa prosseguir digite JAVA (de qualquer forma) (você possui 3 tentativas) (você está com %d) digite abaixo corretamente: ", palavraInicializacao, tentativaInicializacao);
                System.out.println(Cores.RESET);
                palavraInicializacao = scanner.nextLine();
                palavraInicializacao = palavraInicializacao.toUpperCase().replace(" ", "");
                if (palavraInicializacao.equals("JAVA")) {
                    return true;
                }
                if (tentativaInicializacao >= 3) {
                    System.out.println(Cores.VERMELHO + "VOCÊ EXCEDEU O NUMERO DE TENTATIVAS" + Cores.RESET);
                    System.out.println(Cores.VERDE + "PROGRAMA FINALIZADO!!!" + Cores.RESET);
                    return false;
                }
            }
        }
        return false;
    }
}
