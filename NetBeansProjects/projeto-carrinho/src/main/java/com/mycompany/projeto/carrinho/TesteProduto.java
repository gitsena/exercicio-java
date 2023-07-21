package com.mycompany.projeto.carrinho;

public class TesteProduto {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Caneta", "Material", 2.0);
        Produto produto2 = new Produto("Copo", "Bazar", 10.0);
        Produto produto3 = new Produto("Camiseta", "Téxtil", 70.0);
        Produto produto4 = new Produto("Celular", "Eletronico", 5000.0);

        Carrinho carrinho1 = new Carrinho("André");

        //Adicionar produtos no carrinho 1
        carrinho1.adicionar(produto1);
        carrinho1.adicionar(produto2);
        carrinho1.adicionar(produto3);
        carrinho1.adicionar(produto4);

        //Exibir carrinho 1
        System.out.println(carrinho1);

        // Existe produto?
        System.out.println(carrinho1.existsPorNome("Camiseta"));
        System.out.println(carrinho1.existsPorNome("Calça"));

        //
    }
}
