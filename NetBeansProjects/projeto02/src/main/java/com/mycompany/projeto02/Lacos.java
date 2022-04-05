/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto02;

import java.util.Scanner;

/**
 *
 * @author andre.dias.de.sena
 */
public class Lacos {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero gerado: " + i);
        }
        for (int i = 10; i < 0; i--) {
            System.out.println("Numero gerado: " + i);
        }

        System.out.println("Exemplo 3: while - acerte o número");
        System.out.println("Acerte o número:");
        Scanner leitor = new Scanner(System.in);

        Integer numeroDigitado = leitor.nextInt();

        while (numeroDigitado != 42) {
            System.out.println("Errou : (...Tente Novamente:");
            numeroDigitado = leitor.nextInt();

        }
        System.out.println("Acertou Mizeravi!");

        System.out.println("Exemplo 4: While 0 a 10");

        Integer contador = 0;
        while (contador < 10) {
            System.out.println(String.format("Contador: %d", contador));
            contador++;
        }

        System.out.println("Exemplo 5 05: while 10 a 0");
        Integer contador2 = 10;

        while (contador2 >= 0) {
            System.out.println(String.format("Contador %d", contador2));
            contador2--;
        }
        System.out.println("Exemplo 6: do while acerta o numero");
        Integer numeroDigitado2 = leitor.nextInt();

        do {
            System.out.println("Acerte o Número: ");
            numeroDigitado2 = leitor.nextInt();
        } while (numeroDigitado2 != 42);
        System.out.println("Acertou!");
    }

}
