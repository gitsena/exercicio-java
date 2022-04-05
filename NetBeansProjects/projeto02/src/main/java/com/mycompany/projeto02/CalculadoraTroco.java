
package com.mycompany.projeto02;

import java.util.Scanner;



public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        System.out.println("Qual o valor unitario do produto?");
        Double valorUnitario = leitorNumero.nextDouble();
        System.out.println("Quantidade desse produto?");
        Double quantidade = leitorNumero.nextDouble();
        System.out.println("Qual valor pago?");
        Double valorPago = leitorNumero.nextDouble();
        
        Double pagar = valorUnitario * quantidade;
        Double troco = valorPago - pagar;
        
        String frase = String.format("Seu troco será de R$ %.2f",
                troco);
        System.out.println(frase);
    }
}
