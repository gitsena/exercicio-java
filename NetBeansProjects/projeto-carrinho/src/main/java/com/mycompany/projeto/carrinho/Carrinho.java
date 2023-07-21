
package com.mycompany.projeto.carrinho;

import java.util.ArrayList;
import java.util.List;


public class Carrinho {
    //atributo
    private String cliente;
    private List<Produto> produto;

    //construtor
    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produto = new ArrayList<>();
    }

    //metodos
    
    // QUANTIDADE
    public Integer getQuantidade(){
        Integer qtdProduto = 0;
        return qtdProduto ++;
    }
    
    // Adicionar
    public void adicionar (Produto prod){
        produto.add(prod);
    }
    
    // Produto existe?
    public Boolean existsPorNome (String nome){
        Boolean temProduto = false;
        
        
        for (Produto produtoItem : produto) {
            if (nome.equalsIgnoreCase(produtoItem.getNome())) {
                temProduto = true;
            }
        }
        return temProduto;
    }
    
    // Quantidade por categoria
    
    
    
    //get & set
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProduto() {
        return produto;
    }

   /* public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
   */

    @Override
    public String toString() {
        return "\n-------Carrinho---------" + "\nCliente:" + cliente + 
                "\nProduto:" + produto;
    }
    
    
    
    
}
