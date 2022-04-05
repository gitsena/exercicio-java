package com.mycompany.projeto02;

import java.util.Scanner;

public class Acumulado {

    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        Integer numero = leitorNumero.nextInt();

        Integer acumulador = 0;

        while (numero != 0) {
            acumulador += numero;
            System.out.println("Digite outro Número: ");
            numero = leitorNumero.nextInt();

        }
        System.out.println("A soma total dos numeros digitados é: " + acumulador);

        /*if (numero != 0) {
            System.out.println("Digite outro Número: ");
            numero = leitorNumero.nextInt();

        } else {
            System.out.println("A soma total dos numeros digitados é: " + acumulador);
        }
         */
    }
}
