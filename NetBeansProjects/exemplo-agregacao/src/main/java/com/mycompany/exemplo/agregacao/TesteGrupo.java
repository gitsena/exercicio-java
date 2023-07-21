
package com.mycompany.exemplo.agregacao;

public class TesteGrupo {
    public static void main(String[] args) {
        Contato contato01 = new Contato("Giuliana", "(42) 123");
        Contato contato02 = new Contato("João", "(11) 456");
        Contato contato03 = new Contato("Maria","(12)789");
        Contato contato04 = new Contato("Bob","(11) 321");
        
        Grupo grupo01 = new Grupo("Amigos");
        Grupo grupo02 = new Grupo("Trabalho");
        
        // adicionando contatos 
        grupo01.adicionar(contato01);
        grupo01.adicionar(contato02);
        grupo02.adicionar(contato03);
        grupo02.adicionar(contato04);
        
        System.out.println(grupo01);
        System.out.println(grupo02);
        
        
        System.out.println("Remove Giuliana do grupo01");
        grupo01.remover(contato01);
        System.out.println(grupo01);
             
        
    }
}
