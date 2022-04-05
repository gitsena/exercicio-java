package com.mycompany.projeto3;

import java.util.Scanner;

public class App3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual Sua Renda?");
        Double renda = leitor.nextDouble();

        String classe = null;
        if (renda >= 2090001) {
            classe = "A";
            System.out.println("Você recebeu aproximadamente 20 salarios minimos" + classe);
        } else if (renda >= 1045001 || renda <= 2090000) {
            System.out.println("Você recebeu aproximadamente 10 a 20 salarios minimos" + classe);
            classe = "B";
        } else if (renda >= 418001 || renda <= 1045000) {
            System.out.println("Você recebeu aproximadamente 4 a 10 salarios minimos");
            classe = "C";
        } else if (renda >= 209001 || renda <= 418000) {
            System.out.println("Você recebeu aproximadamente 2 a 4 salarios minimos");
            classe = "D";
        } else if (renda >= 110000 || renda <= 209000) {
            System.out.println("Você recebeu aproximadamente 2 salarios minimos");
            classe = "E";
        } else {
            System.out.println("Você recebeu menos que um salario minimo!");
        }
    }
}
