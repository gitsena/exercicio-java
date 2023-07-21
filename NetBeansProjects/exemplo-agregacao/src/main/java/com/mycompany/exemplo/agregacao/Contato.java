package com.mycompany.exemplo.agregacao;

public class Contato {

    //atributo
    private String nome;
    private String telefone;
    private Boolean bloqueado;

    //construtor
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
    }

    //metodo
    public  void bloquear(){
        this.bloqueado = true;
        
    }
     public  void desbloquear(){
        this.bloqueado = false;
    }
    
    //get & set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    //ToString
    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", telefone=" + telefone + ", bloqueado=" + bloqueado + '}';
    }
    
    

}
