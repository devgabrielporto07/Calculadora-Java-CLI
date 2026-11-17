package com.github.devgabrielporto07;
public class Saudacao {
    public static void saudacao (String nome) {
        System.out.print(Cores.AZUL);
        System.out.printf("Saudações %s!, seja bem-vindo ao um projeto simples que pensei em fazer para contemplar meus estudos. Espero que goste.\n", nome);
        System.out.print(Cores.RESET);
    }
}
