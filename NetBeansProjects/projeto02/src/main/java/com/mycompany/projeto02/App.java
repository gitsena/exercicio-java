package com.mycompany.projeto02;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Andre Sena");

        Utilitaria test = new Utilitaria();
        test.exibirLinha();

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um nome");
        String nomeDigitado = leitor.nextLine();

        test.exibeAsoma(27, 28);
        
        // se o metodo tem retorno, quem invocaqchama o metodo
        test.somar(7,2);
      
    }
}
