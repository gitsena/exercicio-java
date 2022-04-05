package com.mycompany.projetopokemon;

public class TestePokemon {

    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Charmeleon", "Fire", 50.0);
        Pokemon pokemon2 = new Pokemon("Vulpix", "Fire", 40.0);
        TreinadorPokemon treinar = new TreinadorPokemon("André");

        // exibindo os dados dos dois pokemons criados
        System.out.println(pokemon1);
        System.out.println(pokemon2);

        // treinando 5 vezes o pokemon 1
        treinar.treinarPokemon(pokemon1);
        treinar.treinarPokemon(pokemon1);
        treinar.treinarPokemon(pokemon1);
        treinar.treinarPokemon(pokemon1);
        treinar.treinarPokemon(pokemon1);

        // evolução do pokemon 1
        System.out.println(pokemon1);
        treinar.evoluirPokemon(pokemon1);
        treinar.evoluirPokemon(pokemon1);

        // treinando o pokemon 2
        treinar.treinarPokemon(pokemon2);
        treinar.treinarPokemon(pokemon2);
        treinar.treinarPokemon(pokemon2);
        
        // exibindo somente o pokemon 2
        System.out.println(pokemon2);
        
        // tentar evoluir o pokemon 2
        treinar.evoluirPokemon(pokemon2);

        // exibir o status do treinador
        System.out.println(treinar);
    }
}
