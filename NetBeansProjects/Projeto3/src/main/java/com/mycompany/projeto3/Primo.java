/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto3;

import java.util.Scanner;

/**
 *
 * @author andre.dias.de.sena
 */
public class Primo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        VerificarPrimo primo = new VerificarPrimo();

        Integer natural;

        do {
            System.out.println("\n Digite um numero natural;");
            natural = leitor.nextInt();
            primo.exibirPrimo(natural);
        } while (natural > 0);

    }
}
