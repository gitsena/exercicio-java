package com.mycompany.projeto3;

import java.util.Scanner;

public class CalcularMedia {

    void exibeAmedia(Double nota1, Double nota2) {
        Double mediaNota = nota1 * 0.4 + nota2 * 0.6;
        System.out.println(mediaNota);

    }

    Double exibir(Double nota1, Double nota2) {
        return nota1 * 0.4 + nota2 * 0.6;

    }
}
