package com.mycompany.projeto.poo1;

import java.util.Scanner;

public class AppBolo {

    public static void main(String[] args) {
        // criando três bolos
        Bolo bolo1 = new Bolo("Morango", 30.0);
        Bolo bolo2 = new Bolo("Chocolate", 40.0);
        Bolo bolo3 = new Bolo("Abacaxi", 50.0);

        // Comprar 5 vezes um bolo
        bolo1.comprarBolo();
        bolo1.comprarBolo();
        bolo1.comprarBolo();
        bolo1.comprarBolo();
        bolo1.comprarBolo();

        // exibir o relatorio
        bolo1.exibirBolo();

    }
}
