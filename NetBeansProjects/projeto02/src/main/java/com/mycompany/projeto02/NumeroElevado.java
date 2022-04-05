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
public class NumeroElevado {

    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        System.out.println("Insira o número Base");
        int numeroBase = leitorNumero.nextInt();
        System.out.println("Insira o número expoente");
        int numeroElevado = leitorNumero.nextInt();

        int acumulado = 1;
        for (int i = 1; i <= numeroElevado; i++) {
            acumulado = acumulado * numeroBase;

        }
        System.out.println(String.format("o valor de %d elevado a %d = %d ",
                numeroBase, numeroElevado, acumulado));
    }
}
