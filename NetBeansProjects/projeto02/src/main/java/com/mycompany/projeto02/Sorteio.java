package com.mycompany.projeto02;

import java.awt.datatransfer.DataFlavor;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {

    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 100");
        Integer numeroDigitado = leitorNumero.nextInt();
        int numeroPar = 0;
        int numeroImpar = 0;
        int sorteado = 0;
        for (int index = 1; index <= 200; index++) {
            Integer numeroRandom = ThreadLocalRandom.current().nextInt(1, 100);
            if (numeroRandom == numeroDigitado) {
                sorteado = index;
            } else if (numeroRandom % 2 == 0) {
                numeroPar++;
            } else if (numeroRandom % 2 != 0) {
                numeroImpar++;
            }
            System.out.println(String.format("%dª- %d", index, numeroRandom));
        }

        System.out.println(String.format("o número %d foi sorteado na %dª vez "
                + "\n o Total de números pares sorteaos foram %d"
                + "\n e o Total de números Impares sorteados foram %d",
                numeroDigitado, sorteado, numeroPar, numeroImpar));
    }
}
