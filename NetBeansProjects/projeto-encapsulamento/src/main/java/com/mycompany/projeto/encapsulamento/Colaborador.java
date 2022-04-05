package com.mycompany.projeto.encapsulamento;

public class Colaborador {

    // Declarando atributos como privados
    // Só essa classe acesso diretamente
    private String nome;
    private String cargo;
    private Double salario;
    
    
    // O Construtor diz com quais valores um colaborador nasce!
   // aqui o salario começa zerado 0
    public Colaborador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 0.0;
    }

    // Sobrecarregando do construtor dando outra informaçao para ele
    // Aqui o salario começa com o valor inserido no objeto
    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    
    @Override
    public String toString() {
        return "Colaborador{" + "nome=" + nome + ", cargo=" + cargo 
                + ", salario=" + salario + '}';
    }
    

    // get e set é o que ira permitir acessar os atributos fora da classe
    // já que agora eles são privados
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
        if(salario > 0){
        this.salario = salario;
        }
    }

}
