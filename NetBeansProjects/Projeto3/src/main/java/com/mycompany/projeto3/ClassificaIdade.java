/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto3;

/**
 *
 * @author andre.dias.de.sena
 */
public class ClassificaIdade {

    void idade(Integer idadeDigitada) {
        if (idadeDigitada <= 2) {
            System.out.println("Bebê");
        } else if (idadeDigitada >= 3 && idadeDigitada <= 11) {
            System.out.println("Criança");
        } else if (idadeDigitada >= 12 && idadeDigitada <= 19) {
            System.out.println("Adolescente");
        } else if (idadeDigitada >= 20 && idadeDigitada <= 30) {
            System.out.println("Jovem");
        } else if (idadeDigitada >= 31 && idadeDigitada <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
