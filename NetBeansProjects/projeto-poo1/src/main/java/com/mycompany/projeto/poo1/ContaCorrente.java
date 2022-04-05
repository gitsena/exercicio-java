package com.mycompany.projeto.poo1;

public class ContaCorrente {

    // Declarando as caracteristicas
    // Atributo
    String nome;
    Double saldo;
    Double sacar;

    // Declarando os comportamentos
    // Comportamentos são chamados de metodos 
    Boolean sacar(Double quantia) {
        saldo -= quantia;
        
        if (saldo < quantia) {
            System.out.println("Não tem saldo");
            return false;
        } else {
            saldo -= quantia;
            System.out.println("Sacou!");
            return true;
            
        }
    }

    void depositar(Double quantia) {
        saldo += quantia;
    }
}
