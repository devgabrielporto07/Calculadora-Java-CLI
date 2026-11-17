package com.github.devgabrielporto07;
import java.util.Scanner;
public class Nome {
    public static String lerNome (Scanner scanner) {
        System.out.print("\nDigite seu nome: ");
        String nome = scanner.nextLine();
        return nome.toUpperCase().trim();
    }
}
