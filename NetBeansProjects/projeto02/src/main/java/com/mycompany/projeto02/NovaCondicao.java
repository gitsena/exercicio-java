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
public class NovaCondicao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        Integer numeroDigitado = leitor.nextInt();

        System.out.println(numeroDigitado);

        switch (numeroDigitado) {
            case 1:
                System.out.println("Domingou");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            default:
                System.out.println("Numero inválido");
                break;
        }

        System.out.println("Digite o ranking: ");
        Integer rankingObitido = leitor.nextInt();

        switch (rankingObitido) {
            case 1:
                System.out.println("Ganhou um iphone 13");
                break;
            case 2:
                System.out.println("Ganhou um ipad mini");
                break;
            case 3:
                System.out.println("Ganhou uma viagem pra floripa");
                break;

            default:
                throw new AssertionError();
        }
    }
}
