package com.mycompany.projeto.poo1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // a estancia conta1 é do tipo ContaCorrente
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();

        conta1.nome = "André";
        conta1.saldo = 0.00;

        conta2.nome = "Jhol";
        conta2.saldo = 1000.0;

        conta1.depositar(60.0);

        conta1.sacar(50.0);
        conta1.sacar(15.0);
        
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o saque: ");
        Double valorSaque = leitor.nextDouble();
        
        Boolean sucesso = conta2.sacar(valorSaque);
        while(!sucesso){
            System.out.println("Digite novamente :(");
        }
        
        
        System.out.println(String.format("Saldo atual: R$%.2f", 
                conta1.saldo));

    }
   
}
