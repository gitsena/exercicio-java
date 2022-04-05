package com.mycompany.projeto.encapsulamento;

public class ContaCorrente {

    private String nomeTitular;
    private Double saldo;

    public ContaCorrente(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valorDeposito) {
        
        saldo += valorDeposito;
        System.out.println(String.format("%s, depositou %.2f ",
                this.nomeTitular));

    }

    public void sacar(Double valorSaque) {
        saldo -= valorSaque;
        System.out.println(String.format("%s, Sacou %.2f ",
                this.nomeTitular));

    }

}
