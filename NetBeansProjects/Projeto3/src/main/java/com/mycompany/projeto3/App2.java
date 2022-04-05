package com.mycompany.projeto3;

import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a primeira Nota?");
        Double nota1 = leitor.nextDouble();
        System.out.println("Qual a segunda Nota?");
        Double nota2 = leitor.nextDouble();
        CalcularMedia media = new CalcularMedia();
        media.exibeAmedia(nota1, nota2);
    }

}
