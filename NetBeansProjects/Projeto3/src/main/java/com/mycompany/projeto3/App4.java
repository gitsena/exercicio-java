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
public class App4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        Integer idadeDigitada = leitor.nextInt();
        
        ClassificaIdade exibir = new ClassificaIdade();
        
        exibir.idade(idadeDigitada);
    }
}
