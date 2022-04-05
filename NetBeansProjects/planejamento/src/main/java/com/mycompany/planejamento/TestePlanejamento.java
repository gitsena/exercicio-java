package com.mycompany.planejamento;

public class TestePlanejamento {

    public static void main(String[] args) {
        // Criando as trefas com suas caracteristicas
        Planejamento tarefa1 = new Planejamento(
                "Sistemas Operacionais", "André Sena", 3);
        Planejamento tarefa2 = new Planejamento(
                "Análise de Sistemas", "Paloma Souza", 2);
        Planejamento tarefa3 = new Planejamento(
                "Linguagem de Programação", "Jonathan Gomes", 2);

        // Dias para terminar a tarefa1
        tarefa1.terminarAtividade();
        tarefa1.terminarAtividade();
        // Exibir os dados da tarefa1
        System.out.println(tarefa1);
        // Exibir o calculo do tempo que levou para terminar atividade
        tarefa1.CalcularTempo();

        // Dias para terminar a tarefa2
        tarefa2.terminarAtividade();
        tarefa2.terminarAtividade();
        tarefa2.terminarAtividade();
        tarefa2.terminarAtividade();
        tarefa2.terminarAtividade();
        // Exibir os dados da tarefa2
        System.out.println(tarefa2);
        // Exibir o calculo do tempo que levou para terminar atividade
        tarefa2.CalcularTempo();

        // Dias para terminar a tarefa2
        tarefa3.terminarAtividade();
        tarefa3.terminarAtividade();
        // Exibir os dados da tarefa3
        System.out.println(tarefa3);
        // Exibir o calculo do tempo que levou para terminar atividade
        tarefa3.CalcularTempo();
    }
}
