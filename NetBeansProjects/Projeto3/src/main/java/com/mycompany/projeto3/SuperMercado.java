
package com.mycompany.projeto3;

import java.util.Scanner;

public class SuperMercado {

    public static void main(String[] args) {
  
        DescontoProgressivo exibir = new DescontoProgressivo();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem Vindo ao Sistema de Desconto Progressivo!\n\t ");
        System.out.println("Digite o Valor Unitario do Produto:");
        Double valor = leitor.nextDouble();
        System.out.println("Digite a Quantidade:");
        Integer quantidade = leitor.nextInt();
        exibir.desconto(valor, quantidade);
       
    }
}
