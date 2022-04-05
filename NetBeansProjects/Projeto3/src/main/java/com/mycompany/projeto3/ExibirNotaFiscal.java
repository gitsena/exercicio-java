package com.mycompany.projeto3;

public class ExibirNotaFiscal {

    void nota(Double valor, Integer quantidade, Double soma, 
            Double desconto, Double valorApagar) {
        
        System.out.println("------------------------------");
        System.out.println(String.format("Valor do Produto: R$%.2f "
                + "\nQuantidade: %d", valor, quantidade));
        System.out.println("------------------------------");
        System.out.println(String.format("Valor do Desconto: R$%.2f", desconto));
        System.out.println("------------------------------");
        System.out.println(String.format("Valor a pagar: R$%.2f",
                (valorApagar = soma - desconto)));
    }
}
