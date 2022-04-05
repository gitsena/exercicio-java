package com.mycompany.projeto.poo1;

public class Empregado {

    private String nome;
    private String cargo;
    private Double salario;

    public Empregado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado" + "\nnome: " + nome + "\ncargo: "
                + cargo + "\nsalario: R$ " + salario;
    }

    public void reajusteSalario() {
        Double reajuste = salario * 15/100;
        salario += reajuste;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
