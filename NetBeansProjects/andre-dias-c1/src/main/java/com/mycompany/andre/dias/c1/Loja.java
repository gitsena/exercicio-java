
package com.mycompany.andre.dias.c1;

import java.util.Scanner;


public class Loja {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem-Vindo administrador! Faça o controle de produtos:"
                + "\n\nQuantidade de produtos em estoque:");
        Integer quantidadeProduto = leitor.nextInt();
        System.out.println("Meta de Venda:");
        Integer metaVenda = leitor.nextInt();
        Integer meta = quantidadeProduto * metaVenda / 100;
        System.out.println(String.format("\nPara atingir sua meta, você precisa"
                + " vender %d produtos!\n", meta));
        
        System.out.println("Escolha os proximos passos"
                + "\n 1- Realizar Venda"
                + "\n 2- Sair");
        Integer escolhaOpcao = leitor.nextInt();
        
        switch (escolhaOpcao) {
            case 2:
                System.out.println("Até Logo!");
             
                break;
            case 1:
                System.out.println("\nDigite a quantidade de produto desejada:");
                Integer quantidadeDesejada = leitor.nextInt();
                
                for (int i = 1; i <= quantidadeDesejada; i++) {
                    int quantidadeAtual = quantidadeProduto - i;
                        if (quantidadeDesejada > quantidadeProduto) {
                            System.out.println(String.format("\nInfelizmente não "
                                    + "temos a quantidade de produtos digitada."
                                    + "\nQuantidade Disponível: %d"
                                    + "\n\nDigite uma quantidade válida:", 
                                    quantidadeProduto));
                            quantidadeDesejada = leitor.nextInt();
                        }
                            System.out.println(String.format("Venda de %dº "
                                    + "produto registrada,restam %d no estoque", 
                                    i, quantidadeAtual));
                }
                System.out.println("-----------------------------------------");
                            System.out.println(String.format("Você acabou de "
                                    + "vender %d produtos "
                                    + "(sua meta é vender %d!) ", 
                                    quantidadeDesejada, 
                                    meta));
               
                break;
            default:
                System.out.println("Número Inválido");
                
                break;
        }
    }
}
