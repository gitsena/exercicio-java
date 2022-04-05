package com.mycompany.projeto.lista;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        // var args = [];
        // String[] teste = new String[10];
        // lista vetor elastic
        // sintxe padrão para se iniciar uma lista
        List listaEstranha = new ArrayList();

        /* 
        o metodo "add" permite adicionar um valor
        na lista 
        listaEstranha.add("Manoel");
        listaEstranha.add(10);
        listaEstranha.add(42.0);
        listaEstranha.add(true);
        
        System.out.println(listaEstranha);
         */
        // Declaração padrão definindo um tipo para nossa aplicação
        // list (generic type)
        List<String> nomes = new ArrayList();
        nomes.add("Manoel");
        nomes.add("Diego");
        nomes.add("Gerson");
        nomes.add("Giuliana");

        /* SIZE() -> retorna quantidade de itens dentro da lista;
        get() -> tenta buscas um iten especifico;
        
         */
        // percorrer a lista e mostrar um abaixo do outro
        /*for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }*/
        // System.out.println(nomes);
        System.out.println("nomes antes do remove");
        // for aprimorado (enhanced for) simbolo " : " substitue o index)
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        System.out.println("\nnomes depois do remove");
        nomes.remove(0);
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        nomes.set(0, "Frizza");

        System.out.println("-".repeat(15));
        System.out.println("Depois do set (Frizza)");

        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        nomes.add(0, "Alex");
        System.out.println("-".repeat(15));
        System.out.println("Depois do add (Alex)");

        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        Boolean estaVazio = nomes.isEmpty();

        if (nomes.isEmpty()) {

        }

        List<Integer> idades = new ArrayList();
        idades.add(20);
        idades.add(25);

        List<Integer> idades2;

        List<Double> precos = new ArrayList();
        precos.add(42.0);

        List<Boolean> verdadeiro = new ArrayList();
        verdadeiro.add(true);

       
        System.out.println("-".repeat(15));
        // ------------------ parte 2 ------------------//
        Animacao a1 = new Animacao("Jureg", 2001);
        Animacao a2 = new Animacao("Espanta Tubarão", 2005);
        Animacao a3 = new Animacao("Irmão Urso", 2003);
        Animacao a4 = new Animacao("Proucurando Nemo", 2002);

        List<Animacao> animacoes = new ArrayList<>();
        animacoes.add(a1);
        animacoes.add(a2);
        animacoes.add(a3);
        animacoes.add(a4);

        for (Animacao animacao : animacoes) {
            System.out.println(animacao.toString());

        }
    }

}
