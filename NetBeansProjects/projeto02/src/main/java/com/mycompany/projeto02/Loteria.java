package com.mycompany.projeto02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um Número de 0 a 10: ");
        Integer numeroDigitado = leitor.nextInt();
        System.out.println(numeroDigitado);
        
        Integer numero = ThreadLocalRandom.current().nextInt(0, 11);
        System.out.println(String.format("Numero gerado: %d", numero));

        Integer contador = 1;
        do {
            contador++;
            System.out.println("Errou, tente Novamente!");
            numeroDigitado = leitor.nextInt();
            System.out.println(String.format("Numero gerado: %d", numero));
            numero = ThreadLocalRandom.current().nextInt(0, 11);
        } while (numeroDigitado != numero);
        {
            System.out.println(String.format("Numero gerado: %d", numero));

            if (contador <= 3) {
                System.out.println("Você é MUITO sortudo");
            } else if (contador >= 4) {
                System.out.println("Você é sortudo");
            } else {
                System.out.println("É melhor você parar de apostar e ir trabalhar");

            }

        }
    }
}
