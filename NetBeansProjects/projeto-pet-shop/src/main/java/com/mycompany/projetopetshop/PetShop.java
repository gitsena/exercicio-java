package com.mycompany.projetopetshop;

public class PetShop {

    // Atributos privados
    private String nome;
    private Double faturamento;

    // Construtor com faturamento inicado em 0
    public PetShop(String nome) {
        this.nome = nome;
        this.faturamento = 0.0;
    }

    // toString Exibir as informações (formatado Interpolação)
    @Override
    public String toString() {
        return String.format("\n-----PetShop-----"
                + "\nNome: %s"
                + "\nFaturamento Total: R$ %.2f\n",
                nome, faturamento);
    }

    // Método do PetShop
    // Dar Banho
    public void darBanho(Pet pet) {
        Integer qtdVisitas = pet.getQtdVisitas() + 1;
        Double valor = 0.0;
        Double desconto = 0.0;
        Double custoFinal = 0.0;

        if (qtdVisitas == 1) {
            valor = 50.0;
            this.faturamento = valor;

        } else if (qtdVisitas > 1) {
            for (int contador = 1; contador <= qtdVisitas; contador++) {
                desconto += 5.0;
                valor += 50.0;
            }
            this.faturamento += valor - desconto;

        }

        custoFinal = valor - desconto;
        pet.setQtdVisitas(qtdVisitas);
        pet.setValorGasto(custoFinal);
        this.faturamento = this.faturamento;

        System.out.println(String.format("\n%s tomou banho pela %dº vez "
                + "sendo assim receberá um desconto de R$ %.2f",
                pet.getNomePet(), qtdVisitas, desconto));
    }

    // Get & Set da clase PetShop
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

}
