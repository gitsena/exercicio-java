package com.mycompany.exemplo.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

    // atributos com lista 
    private String nome;
    private List<Contato> contatos;

    //Construtor com lista
    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public void adicionar(Contato cont) {
        contatos.add(cont);
    }

    public void remover(Contato cont) {
        contatos.remove(cont);

    }

    // Get & Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        return "Grupo{" + "nome=" + nome + ", contatos=" + contatos + '}';
    }

}
