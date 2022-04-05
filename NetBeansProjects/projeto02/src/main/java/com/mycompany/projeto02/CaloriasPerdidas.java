package com.mycompany.projeto02;

import java.util.Scanner;

public class CaloriasPerdidas {

    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        System.out.println("Tempo em min que passou se aquecendo?");
        Integer aquecendo = leitorNumero.nextInt();
        Integer perdaAquecimento = aquecendo * 12;
        System.out.println("Tempo em min que fez exercicios aeróbicos?");
        Integer aerobicos = leitorNumero.nextInt();
        Integer perdaAerobicos = aerobicos * 20;
        System.out.println("Tempo em min que fez musculação?");
        Integer musculacao = leitorNumero.nextInt();
        Integer perdaMusculacao = musculacao * 25;

        Integer tempoTotal = aquecendo + aerobicos + musculacao;
        Integer perdaTotal = perdaAquecimento + perdaAerobicos + perdaMusculacao;
        String frase = String.format("Olá, Jorge. Você fez um total de %s "
                + "minutos de exercícios e perdeu cerca de %s calorias", 
                tempoTotal, perdaTotal);
        System.out.println(frase);

    }
}
