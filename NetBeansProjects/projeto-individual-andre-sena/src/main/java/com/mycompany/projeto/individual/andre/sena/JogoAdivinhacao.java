package com.mycompany.projeto.individual.andre.sena;

import java.util.Scanner;

/**
 *
 * @author andre.dias.de.sena
 */
public class JogoAdivinhacao {

    void exibirJogo(String nomeDigitado) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("----------------Vamos Jogar!--------------------\n"
                + "Neste Jogo de perguntas e respostas "
                + "vamos testar seu conhecimento turistico;");
        System.out.println("Pronto!?"
                + "\n1- Começar"
                + "\n2- Sair");
        Integer jogar = leitor.nextInt();
        while (jogar < 1 || jogar > 2) {
            System.out.println("Digite uma opção válida:"
                    + "\n1- para Começar a jogar"
                    + "\n2- para Sair");
            jogar = leitor.nextInt();
        }
        switch (jogar) {
            case 1:
                int pontos = 0;
                // 1- Questão
                System.out.println("Esclha a alternativa correta!");
                System.out.println("Qual a maravilha do mundo mais visitada?"
                        + "\n 1- Coliseu, Itália"
                        + "\n 2- Taj Mahal, Índia."
                        + "\n 3- Grande Muralha da China"
                        + "\nEsoclha a alternativa correta!");
                Integer alternativaCorreta = leitor.nextInt();
                while (alternativaCorreta < 1 || alternativaCorreta > 3) {
                    System.out.println("----------Opação Inválida!-------------"
                            + "\nEscolha uma das alternativas!"
                            + "\nQual a maravilha do mundo mais visitada?"
                            + "\n 1- Coliseu, Itália"
                            + "\n 2- Taj Mahal, Índia."
                            + "\n 3- Grande Muralha da China");
                    alternativaCorreta = leitor.nextInt();
                }
                if (alternativaCorreta == 3) {
                    System.out.println("Certa Resposta! Marcou ponto ;) \n");
                    pontos = pontos + 200;
                }else{
                    System.out.println("Errou! Não pontuou :( \n");
                    
                }
                
                // 2- Questão
                System.out.println("Quantos anos levou, para a constução do "
                        + "Cristo Redentor?"
                        + "\n 1- 5 anos"
                        + "\n 2- 4 anos"
                        + "\n 3- 2 anos"
                        + "\nEsoclha a alternativa correta!");
                System.out.println("------------------------------------------");
                alternativaCorreta = leitor.nextInt();
                
                while (alternativaCorreta < 1 || alternativaCorreta > 3) {
                    System.out.println("-------------Opação Inválida!--------"
                            + "\nEscolha uma das alternativas!"
                            + "\nQuantos anos levou, para a constução do "
                            + "Cristo Redentor?"
                            + "\n 1- 5 anos"
                            + "\n 2- 4 anos"
                            + "\n 3- 2 anos");
                    alternativaCorreta = leitor.nextInt();
                }
                if (alternativaCorreta == 1) {
                    System.out.println("Certa Resposta! Marcou ponto ;) \n");
                    pontos = pontos + 200;
                } else {
                    System.out.println("Errou! Não pontuou :( \n");
                }
                
                //3- Questão
                System.out.println("Qual a Maravilha do 'mundo antigo' que existe"
                        + "até hoje?"
                        + "\n 1- Templo de Diana"
                        + "\n 2- Pirâmides do Egito"
                        + "\n 3- Farol de Alexandria"
                        + "\nEsoclha a alternativa correta!");
                    alternativaCorreta = leitor.nextInt();
                while (alternativaCorreta < 1 || alternativaCorreta > 3) {
                    System.out.println("------------Opação Inválida!----------"
                            + "\nEscolha uma das alternativas!"
                            + "\nQual a Maravilha do 'mundo antigo' que existe"
                            + "até hoje?"
                            + "\n 1- Templo de Diana"
                            + "\n 2- Pirâmides do Egito"
                            + "\n 3- Farol de Alexandria");
                    alternativaCorreta = leitor.nextInt();
                }
                if (alternativaCorreta == 2) {
                    System.out.println("Certa Resposta! Marcou ponto ;) \n");
                    pontos = pontos + 200;
                }else{
                    System.out.println("Errou! Não pontuou :( \n");
                    
                }
                
                //4- Questão
                System.out.println("Onde se localiza as Ruinas de Petra"
                        + "\n 1- Jordânia"
                        + "\n 2- Egito"
                        + "\n 3- Índia"
                        + "\nEsoclha a alternativa correta!");
                    alternativaCorreta = leitor.nextInt();
                while (alternativaCorreta < 1 || alternativaCorreta > 3) {
                    System.out.println("------------Opação Inválida!----------"
                            + "\nEscolha uma das alternativas!"
                            + "Onde se localiza as Ruinas de Petra"
                            + "\n 1- Jordânia"
                            + "\n 2- Egito"
                            + "\n 3- Índia");
                    alternativaCorreta = leitor.nextInt();
                }
                if (alternativaCorreta == 1) {
                    System.out.println("Certa Resposta! Marcou ponto ;) \n");
                    pontos = pontos + 200;
                }else{
                    System.out.println("Errou! Não pontuou :( \n");
                    
                }
                
                //5- Questão
                System.out.println("Qual é a oitava maravilha do mundo?"
                        + "\n 1- Chichén Itzá, México."
                        + "\n 2- Taj Mahal, Índia."
                        + "\n 3- Machu Picchu, Peru"
                        + "\nEsoclha a alternativa correta!");
                    alternativaCorreta = leitor.nextInt();
                while (alternativaCorreta < 1 || alternativaCorreta > 3) {
                    System.out.println("------------Opação Inválida!----------"
                            + "\nEscolha uma das alternativas!"
                            + "Qual é a oitava maravilha do mundo?"
                            + "\n 1- Chichén Itzá, México."
                            + "\n 2- Taj Mahal, Índia."
                            + "\n 3- Machu Picchu, Peru");
                    alternativaCorreta = leitor.nextInt();
                }
                if (alternativaCorreta == 3) {
                    System.out.println("Certa Resposta! Marcou ponto ;) \n");
                    pontos = pontos + 200;
                }else{
                    System.out.println("Errou! Não pontuou :( \n");
                    
                }
                
                if(pontos == 0){
                    System.out.println(String.format("POXA Não foi desta %S"
                            + "\nInfelismente você não pontuou sendo assim "
                            + "não recebe medalha :( \n", 
                            nomeDigitado));
                }else if (pontos >= 1000){
                    System.out.println(String.format("-----PAAAAARAAABEEEENS!!!-----"
                    + "\n%s!!! VOCÊ MANDOU MUITO BEM! É UM VERDADEIRO HISTORIADOR"
                    + "\nConquistou nossa medalha de 'OURO'"
                    + "\nMarcando %d pontos no total", 
                    nomeDigitado, pontos));
                }else if (pontos >= 600 && pontos <= 800){
                    System.out.println(String.format("-------MANDOU MUITO BEM!!---------"
                            + "\n%s você mostrou ser mesmo um turista de carteirinha"
                            + "\nRecebeu nossa medalha de 'PRATA'"
                            + "\nMarcou %d pontos no total",
                            nomeDigitado, pontos));
                }else{
                    System.out.println(String.format("--------- "
                            + "\n%s Você precisa sair mais de casa"
                            + "\nTem nossa medalha de 'BRONZE'"
                            + "\nMarcou %d pontos no total", 
                            nomeDigitado, pontos));
                }
                break;
                
            case 2:
                System.out.println("----------------Até logo!-----------------");
            default:

                break;
            
        }
    }
}
