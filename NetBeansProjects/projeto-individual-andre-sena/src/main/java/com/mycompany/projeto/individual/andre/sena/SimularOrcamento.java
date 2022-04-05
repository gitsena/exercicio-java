
package com.mycompany.projeto.individual.andre.sena;

import java.util.Scanner;

/**
 *
 * @author andre.dias.de.sena
 */
public class SimularOrcamento {

    void exibirSimulacao(String nomeDigitado, String monumento, Double valorViagem, 
           Double orcamentoFinal, Integer diasDigitado) {
           Scanner leitor = new Scanner(System.in);

// Operação lógica//

    System.out.println(String.format("%s, Escolha a Maravilha do Mundo "
        + "que você deseja conhecer! "
        + "\n Digita o número que ela representa;"
        + "\n 101 - Cristo Redentor, Rio Janeiro."
        + "\n 102 - Machu Picchu, Peru."
        + "\n 103 - Chichén Itzá, México."
        + "\n 104 - Coliseu, Itália."
        + "\n 105 - Ruinas de Petra, Jordânia."
        + "\n 106 - Taj Mahal, Índia."
        + "\n 107 - Grande Muralha da China."
        , nomeDigitado));
    Integer codigoDigitado = leitor.nextInt();

    while(codigoDigitado < 101 || codigoDigitado > 107){
        System.out.println("Número Inválido\n"
                        + "\nDigite um número válido"
                        + "\n 101 - Cristo Redentor, Rio Janeiro."
                        + "\n 102 - Machu Picchu, Peru."
                        + "\n 103 - Chichén Itzá, México."
                        + "\n 104 - Coliseu, Itália."
                        + "\n 105 - Ruinas de Petra, Jordânia."
                        + "\n 106 - Taj Mahal, Índia."
                        + "\n 107 - Grande Muralha da China.");
                codigoDigitado = leitor.nextInt();
    }
            switch (codigoDigitado) {
                case 101:
                    monumento = "O Cristo Redentor no Rio de Janeiro";
                    valorViagem = 170.00;
                    
                    break;
                case 102:
                    monumento = "Machu Picchu, no Peru";
                    valorViagem = 320.00;
                    break;
                case 103:
                    monumento = "Chichén Itzá, no México";
                    valorViagem = 325.00;
                    break;
                case 104:
                    monumento = "Coliseu, na Itália";
                    valorViagem = 530.00;
                    break;
                case 105:
                    monumento = "Ruinas de Petra, em Jordânia";
                    valorViagem = 400.00;
                    break;
                case 106:
                    monumento = "Taj Mahal, na Índia";
                    valorViagem = 510.00;
                    break;
                case 107:
                    monumento = "Grande Muralha na China";
                    valorViagem = 450.00;
                    break;
                default:
                    
                    break;         
            }
                System.out.println(String.format("\nEXCELENTE ESCOLHA! %s, %s, é um "
                        + "Monumento Incrivel!!\n"
                        + "valor da diária R$%.2f",
                        nomeDigitado, monumento, valorViagem));
                
         // Inserir a quantidade de dias da viagem, para calcular o orçamento //
                System.out.println("\nQuantos dias pretende viajar?");
                diasDigitado = leitor.nextInt();
                orcamentoFinal = diasDigitado * valorViagem;
                
                // Forma de pagamento //
                double debitoCredito = 0.0;
                String pagamento = null;
                    System.out.println("Qual será a forma de pagamento:"
                        + "\n digite 1 para Debito"
                        + "\n digite 2 para Crédito");
                    Integer formaPagamento = leitor.nextInt();
                while(formaPagamento < 1 || formaPagamento > 2 ){
                    System.out.println(String.format("%s Escolha uma forma "
                            + "de pagamento.\nDigite um numero válido:"
                            + "\n1 para Debito"
                            + "\n2 para Crédito", nomeDigitado));
                    formaPagamento = leitor.nextInt();
                }
            switch (formaPagamento) {
                case 2:
                    System.out.println(String.format("Muito Bem! %s, já "
                            + "registramos sua "
                            + "forma de pagamento\n", nomeDigitado));
                    pagamento = "Crédito";
                    debitoCredito = orcamentoFinal * 20/100;
                    break;
                case 1:
                    System.out.println(String.format("Muito Bem! %s, "
                            + "já registramos sua "
                            + "forma de pagamento\n", nomeDigitado));
                    pagamento = "Débito";
                    break;
                default:
                   
                    break;
            }
              
                //Tudo incluso //
                System.out.println("Deseja tudo incluso?"
                        + "\n1- sim"
                        + "\n2- Não");
                Integer opcaoDigitada = leitor.nextInt();
                String tudoIncluso = null;
                double valorIncluso = 0.0;
                
                while(opcaoDigitada < 1 || opcaoDigitada > 2 ){
                    System.out.println(String.format("%s Digite corretamente uma "
                            + "opção"
                            + "\n1- para sim "
                            + "\n2- para não "
                            + "\nDeseja viajar com tudo incluso?", nomeDigitado));
                    opcaoDigitada = leitor.nextInt();
                }
            switch (opcaoDigitada) {
                case 1:
                    System.out.println("é isso ai, já quer curtir com tudo no esquema!\n\n");
                    valorIncluso = orcamentoFinal * 45/100;
                    tudoIncluso = "Sim :)";
                    break;
                case 2:
                    System.out.println("muito bem, já estamos "
                            + "finalizando\n\n");
                    tudoIncluso = "Não :(";
                    break;
                default:
                    
                    break;
            }
            
            /* Apresentar Oraçamento final de acordo com as opções escolhida pelo 
            usuario de forma de pagamento e se deseja tudo incluso
            */
            if(formaPagamento  == 1 && opcaoDigitada == 1){
                System.out.println(String.format("%s, o orçamento da sua "
                        + "viagem ficou assim;"
                        + "\n----------------------------------------------------"
                        + "\nMonumento que deseja visitar: %s"
                        + "\nQuantidade de dias: %d"
                        + "\nForma de Pagamento: %s"
                        + "\nOpção de tudo incluso: %s"
                        + "\n----------------------------------------------------"
                        + "\nvalor de tudo incluso durante os %d dias é de R$%.2f"
                        + "\nValor total a ser pago: R$%.2f ",
                        nomeDigitado, monumento, diasDigitado, pagamento,
                        tudoIncluso, diasDigitado, valorIncluso, 
                        (orcamentoFinal + valorIncluso)));
                 
            } else if (formaPagamento == 1 && opcaoDigitada == 2) {
                System.out.println(String.format("%s, o orçamento da sua "
                        + "viagem ficou assim;"
                        + "\n----------------------------------------------------"
                        + "\nMonumento que deseja visitar: %s"
                        + "\nQuantidade de dias: %d"
                        + "\nForma de Pagamento: %s"
                        + "\nOpção de tudo incluso: %s"
                        + "\n----------------------------------------------------"
                        + "\nValor total a ser pago: R$%.2f ",
                        nomeDigitado, monumento, diasDigitado, pagamento,
                        tudoIncluso, orcamentoFinal));
                 
            }else if(formaPagamento  == 2 && opcaoDigitada == 2){
                 double valorTotal = orcamentoFinal + debitoCredito;
                 System.out.println(String.format("%s, o orçamento da sua "
                        + "viagem ficou assim;"
                        + "\n----------------------------------------------------"
                        + "\nMonumento que deseja visitar: %s"
                        + "\nQuantidade de dias: %d"
                        + "\nForma de Pagamento: %s"
                        + "\nOpção de tudo incluso: %s"
                        + "\n----------------------------------------------------"
                        + "\nValor total a ser pago: R$%.2f ",
                        nomeDigitado, monumento, diasDigitado, pagamento,
                        tudoIncluso, valorTotal));
                
            } else if (formaPagamento == 2 && opcaoDigitada == 1) {
                double valorTotal = orcamentoFinal + debitoCredito;
                orcamentoFinal = valorTotal + valorIncluso;
                System.out.println(String.format("%s, o orçamento da sua "
                        + "viagem ficou assim;"
                        + "\n----------------------------------------------------"
                        + "\nMonumento que deseja visitar: %s"
                        + "\nQuantidade de dias: %d"
                        + "\nForma de Pagamento: %s"
                        + "\nOpção de tudo incluso: %s"
                        + "\n----------------------------------------------------"
                        + "\nvalor de tudo incluso durante os %d dias é de R$%.2f"
                        + "\nValor total a ser pago: R$%.2f ",
                        nomeDigitado, monumento, diasDigitado, pagamento,
                        tudoIncluso, diasDigitado, valorIncluso, orcamentoFinal));

            }else{
                System.out.println("OPA! parece que alguma opção não foi "
                        + "selecionada corretamente");
            }
    }
}
