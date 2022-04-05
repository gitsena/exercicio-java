
package com.mycompany.projeto.lista;



public class Animacao {
    // atributos
    private String nome;
    private Integer anoLancamento;

    // construtor
    public Animacao(String nome, Integer anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    // Get & Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Animacao" + "\nnome: " + nome + "\nanoLancamento: " + anoLancamento;
    }
    
    
}
