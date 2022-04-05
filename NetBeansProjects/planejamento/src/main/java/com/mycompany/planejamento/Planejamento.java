package com.mycompany.planejamento;

public class Planejamento {

    // Atributos Privados
    private String atividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    // Construtor 
    public Planejamento(String atividade, String responsavel,
            Integer diasEstimados) {
        this.atividade = atividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }

    // Métodos do Planejamento
    // Terminar Atividade
    public void terminarAtividade() {
        this.diasUsados++;
    }

    // Calcular Tempo
    public void CalcularTempo() {
        Integer diasNecessarios = 0;

        if (this.diasUsados > this.diasEstimados) {
            diasNecessarios = this.diasUsados - this.diasEstimados;
            System.out.println(String.format("Você estimou %d dias, mas a tarefa"
                    + " foi feita em %d dias (%d dias a mais que o estimado). "
                    + "Melhore a estimativa",
                    this.diasEstimados, this.diasUsados, diasNecessarios));

        } else if (this.diasUsados < this.diasEstimados) {
            diasNecessarios = this.diasEstimados - this.diasUsados;
            System.out.println(String.format("Você estimou %d dias, e a tarefa"
                    + " foi feita em %d dias (%d dias a menos que o estimado). "
                    + "PARABENS!!!",
                    this.diasEstimados, this.diasUsados, diasNecessarios));

        } else {
            System.out.println(String.format("Você estimou %d dias, e a tarefa "
                    + "foi feita em %d dias, atendendo a estimativa com precisão",
                    this.diasEstimados, this.diasUsados));

        }

    }

    // toString exibir as informações do planejamento
    @Override
    public String toString() {
        return "------------Planejamento--------------"
                + "\natividade: " + atividade
                + "\nresponsavel: " + responsavel
                + "\ndiasEstimados: " + diasEstimados
                + "\ndiasUsados: " + diasUsados;
    }

    // Get & Set
    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void setDiasUsados(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }

}
