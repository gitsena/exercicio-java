
package com.mycompany.projeto.carrinho;

public class Produto {
   //Atributo
    private String nome;
    private String categoria;
    private Double preco;

    public Produto(String nome, String categoria, Double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
    
    
    
    //GET & SET

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\n---------Produto--------" + "\nNome:" + nome + 
                "\nCategoria:" + categoria + "\nPreço:" + preco;
    }
    
    
    
    
}
