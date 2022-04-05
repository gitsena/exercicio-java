package com.mycompany.projeto02;

public class Utilitaria {

    void exibirLinha() {
        System.out.println("-".repeat(20));
    }

    void exibeNomeEsobrenome(String nome, String sobrenome) {
        System.out.print(String.format("nome, %s \nSobrenome: %s",
                nome, sobrenome));
    }

    void exibeApresentacao(String nome, Integer idade, Double altura) {
        String frase = "Meu nome é %s,tenho %d idade e %.2f de altura.";
        System.out.println("String.format(frase, nome, idade, altura)");

    }

    void exibeAsoma(Integer numero1, Integer numero2) {
        Integer soma = numero1 + numero2;
        System.out.println(soma);
        // System.out.println(numero1 + numero2);

    }

    void exibeSomaNumeros(Integer numero1, Integer numero2) {
        Integer soma = numero1 + numero2;
        System.out.println(String.format("%d + %d = %d", numero1, numero2, soma));
    }
    //metodo com retorno
    // void nao retorna
    // Integer retorna Integer
    // Double retorna Double
    Integer somar(Integer numero1, Integer numero2){
        return numero1 + numero2;
    
    }
    
    // exercicio 1
    
    
}
