package com.mycompany.projetopokemon;

public class TreinadorPokemon {

    // atributos treinador
    private String nome;
    private Integer nivel;

    // construtor
    public TreinadorPokemon(String nome) {
        this.nome = nome;
        this.nivel = 0;
    }

    // toString exibir o status do teinador
    @Override    
    public String toString() {
        return "\nTreinador do Pokemon" + "\nNome:" + nome + "\nNivel:" + nivel;
    }

    //metodo treinar pokemon
    public void treinarPokemon(Pokemon criatura) {
        Double forcaAtual = criatura.getForca();
        Integer recebeDoces = criatura.getDoces() + 10;
        this.nivel = this.nivel + 2;
        criatura.setForca(forcaAtual += forcaAtual * 10 / 100);
        criatura.setDoces(recebeDoces);
    }
    
    // metodo evoluir pokemon
    public void evoluirPokemon(Pokemon criatura) {
        String nomeEvolucao;
        nomeEvolucao = "Charizard";
        if (criatura.getDoces() >= 50) {
            Integer perdeDoces = criatura.getDoces() - 50;
            this.nivel = this.nivel + 10;
            criatura.setDoces(perdeDoces);
            System.out.println(String.format("\nPokémon %s evoluiu para -> %s",
                    criatura.getNome(), nomeEvolucao));

        } else {
            System.out.println("\nNão foi possivel realizar a evolução");
        }
    }

    // get& set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

}
