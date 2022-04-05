package com.mycompany.projetopetshop;

public class Pet {

    // Atributos privados
    private String nomePet;
    private String raca;
    private Integer qtdVisitas;
    private Double valorGasto;

    // Construtor com qtdVisitas e valorGasto iniciados em 0
    public Pet(String nomePet, String raca) {
        this.nomePet = nomePet;
        this.raca = raca;
        this.qtdVisitas = 0;
        this.valorGasto = 0.0;
    }

    // toString Exibir as informações (formatado Interpolação)
    @Override
    public String toString() {
        return (String.format("-------Pet-------"
                + "\nNome do Pet: %s"
                + "\nRaça: %s"
                + "\nQuantidade de Visitas: %d "
                + "\nvalor Gasto: R$ %.2f"
                , nomePet, raca, qtdVisitas, valorGasto));
    }
    // Get & Set da clase Pet
    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQtdVisitas() {
        return qtdVisitas;
    }

    public void setQtdVisitas(Integer qtdVisitas) {
        this.qtdVisitas = qtdVisitas;
    }

    public Double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(Double valorGasto) {
        this.valorGasto = valorGasto;
    }

}
