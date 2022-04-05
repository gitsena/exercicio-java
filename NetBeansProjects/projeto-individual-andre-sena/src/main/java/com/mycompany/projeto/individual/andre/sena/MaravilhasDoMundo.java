
package com.mycompany.projeto.individual.andre.sena;
import java.util.Scanner;

/**
 *
 * @author andre.dias.de.sena
 */
public class MaravilhasDoMundo {
    public static void main(String[] args) {
        CuriosidadesTuristicas case2curiosidade = new CuriosidadesTuristicas();
        SimularOrcamento case1simulacao = new SimularOrcamento();
        JogoAdivinhacao case3jogo = new JogoAdivinhacao();
        Scanner leitor = new Scanner(System.in);
        // Introdução e Boas Vindas //
        System.out.println("Olá, nos diga seu nome:");
        String nomeDigitado = leitor.nextLine();
        System.out.println(String.format("\n%s, Seja Bem Vindo A Maravilhas do Mundo "
                + "\n Aqui você poderá simular seus possiveis gastos "
                + "\n para conhecer a Maravilha do Mundo"
                + "\n que Tanto Sonhou!!!", nomeDigitado));
         
        System.out.println("\nEscolha uma opção abaixo:"
                + "\n 1- Simular (Orçamento para sua Viagem)"
                + "\n 2- Curiosidades Turisticas"
                + "\n 3- Jogo Adivinhação"
                + "\n 4- Encerrar");
                Integer menuOpcao = leitor.nextInt();
                
                while(menuOpcao < 1 || menuOpcao > 4){
                    System.out.println("Número Inválido"
                        + "\nDigite um número válido para continuar"
                        + "\n 1- Simular (Orçamento para sua Viagem)"
                        + "\n 2- Curiosidades Turisticas"
                        + "\n 3- Jogo Adivinhação"
                        + "\n 4- Encerrar");
                        menuOpcao = leitor.nextInt();
                }
        switch (menuOpcao) {
            case 4:
                System.out.println("Até Logo!");
                
                break;
            case 1:
                case1simulacao.exibirSimulacao(nomeDigitado, nomeDigitado, 
                       Double.MAX_VALUE, Double.MIN_NORMAL, menuOpcao);
                
            break;

            case 2:
                case2curiosidade.exibirCuriosidades(nomeDigitado);
                break;
                
            case 3:
                case3jogo.exibirJogo(nomeDigitado);
                break;
                
                default:
                
                break;

        }
    }
   
}
