package com.mycompany.andre.sena.c2;

public class Medico {

    // Aributos
    private Integer id;
    private String nome;
    private String especialidade;
    private Boolean ativo;
    private Double salario;

    // Construtor
    public Medico(Integer id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.ativo = true;
        this.salario = 0.0;
    }

    //Get & Set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    // criando uma variavel Validar 
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
        
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    // ToString
    @Override
    public String toString() {
        return String.format("\n--------Medico---------"
                + "\nID: %d"
                + "\nAtivo: %b"
                + "\nNome do Medico: %s"
                + "\nEspecialidade: %s"
                + "\nValor a receber: R$: %.2f",
                id, ativo, nome, especialidade, salario);
    }

}
