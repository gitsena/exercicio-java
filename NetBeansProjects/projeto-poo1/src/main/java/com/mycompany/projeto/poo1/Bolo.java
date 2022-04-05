package com.mycompany.projeto.poo1;

public class Bolo {

    private String sabor;
    private Double valor;
    private Integer quantidadeVendida;

    // construtor
    public Bolo(String sabor, Double valor) {
        this.sabor = sabor;
        this.valor = valor;
        this.quantidadeVendida = 0;
    }

    // método comprar bolo
    public void comprarBolo() {
        Integer quantidadeDesejada = 0;
        if (quantidadeDesejada > 100) {
            System.out.println("eu pedido ultrapassou nosso limite"
                    + " diário para esse bolo.");
        } else {
            this.quantidadeVendida++;
        }
    }

    // método exibir Relatorio
    public void exibirBolo() {
        Double valorTotal = quantidadeVendida * this.valor;
        System.out.println(String.format("O bolo sabor %s, foi comprado "
                + "%d vezes hoje, totalizando R$ %.2f",
                this.sabor, this.quantidadeVendida, valorTotal));
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Integer quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

}
