package com.mycompany.projeto02;

import java.util.Scanner;

public class ExercicioJava {

    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);

        System.out.println("Quantos filhos de 0 a 3 anos?");
        Integer qtdfilhos = leitorNumero.nextInt();
        Double filhosNovos = qtdfilhos * 25.12;

        System.out.println("Quantos filhos de 4 a 16 anos?");
        Integer qtdfilhos2 = leitorNumero.nextInt();
        Double filhosMeio = qtdfilhos2 * 15.88;

        System.out.println("Quantos filhos de 17 a 18 anos?");
        Integer qtdfilhos3 = leitorNumero.nextInt();
        Double filhosVelhos = qtdfilhos3 * 12.44;

        Integer Soma = qtdfilhos + qtdfilhos2 + qtdfilhos3;
        Double Bolsa = filhosNovos + filhosMeio + filhosVelhos;

        System.out.println("Você tem um total de " + Soma + " filhos "
                + "e vai receber R$ " + Bolsa + " de bolsa");
    }
}
