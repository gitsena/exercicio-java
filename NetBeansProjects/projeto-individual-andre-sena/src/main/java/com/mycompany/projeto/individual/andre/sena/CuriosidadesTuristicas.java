
package com.mycompany.projeto.individual.andre.sena;

import java.util.Scanner;

/**
 *
 * @author andre.dias.de.sena
 */
public class CuriosidadesTuristicas {

    void exibirCuriosidades(String nomeDigitado) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Curiosidades!!!"
                + "\nVamos lá! escolha uma Maravilha que deseja saber mais a respeito:"
                + "\n Digita o número que ela representa;"
                + "\n 101 - Cristo Redentor, Rio Janeiro."
                + "\n 102 - Machu Picchu, Peru."
                + "\n 103 - Chichén Itzá, México."
                + "\n 104 - Coliseu, Itália."
                + "\n 105 - Ruinas de Petra, Jordânia."
                + "\n 106 - Taj Mahal, Índia."
                + "\n 107 - Grande Muralha da China.");
        Integer maravilhaEscolhida = leitor.nextInt();
        
            while(maravilhaEscolhida < 101 || maravilhaEscolhida > 107){
                System.out.println("Número Inválido\n"
                        + "\nDigite um número válido"
                        + "\n 101 - Cristo Redentor, Rio Janeiro."
                        + "\n 102 - Machu Picchu, Peru."
                        + "\n 103 - Chichén Itzá, México."
                        + "\n 104 - Coliseu, Itália."
                        + "\n 105 - Ruinas de Petra, Jordânia."
                        + "\n 106 - Taj Mahal, Índia."
                        + "\n 107 - Grande Muralha da China.");
                maravilhaEscolhida = leitor.nextInt();
            }
        switch (maravilhaEscolhida) {
                case 101:
                  System.out.println("O Cristo Redentor no Rio de Janeiro");
System.out.println("-----------------------------------------------------------");
                  System.out.println("feito de concreto armado e pedra-sabão. "
+ "Tem trinta metros de altura, sem contar os oito metros do\npedestal, e seus "
+ "braços se esticam por 28 metros de largura. A estátua pesa 1145 toneladas e é "
+ "a\nterceira maior escultura de Cristo no mundo, menor apenas que a Estátua de "
+ "Cristo Rei de Świebodzi\nna Polônia (a maior escultura de Cristo no mundo) e a de "
+ "Cristo de la Concordia na Bolívia (a segunda\nmaior escultura de Cristo no mundo)");
                  
                    break;

                case 102:
                  System.out.println("Machu Picchu, no Peru");
System.out.println("-----------------------------------------------------------");
                  System.out.println("localizada no topo de uma montanha, no vale "
+ "do rio Urubamba, atual Peru. Foi construída no início do\nséculo XV, por volta "
+ "de 1420, sob as ordens de Pachacuti. As ruínas incas encontram-se a meio caminho\n"
+ "entre os picos das duas montanhas, a 450 metros acima do nível do vale e a 2 438 "
+ "metros acima do nível\ndo mar. A superfície edificada tem aproximadamente 530 "
+ "metros de comprimento por 200 de largura e contém\n172 edifícios em sua área urbana.");  
                    break;
                case 103:
                    System.out.println("Chichén Itzá, no México");
System.out.println("-----------------------------------------------------------");                   
                    System.out.println("O templo de Kukulcán se encontra no centro "
+ "de Chichén Itzá. O templo possui uma altura de 30 metros,\nsendo 26 metros de "
+ "plataformas somadas aos 4 metros do templo que se encontra no topo. O templo " 
+ "é\ncomposto por diversas plataformas quadradas, empilhadas uma a uma. Cada lado "
+ "de pirâmide possui uma\nescadaria que leva até o templo localizado em seu topo, "
+ "sendo que cada uma desses escadarias possui 91\n degraus. Logo na entrada no "
+ "templo temos um único degrau, contabilizando no total 365 degraus,\n"
+ "representando assim os 365 dias do calendário maia.");
                    break;
                case 104:
                    System.out.println("Coliseu, na Itália");
System.out.println("-----------------------------------------------------------");
                    System.out.println("O edifício é construído em mármore, pedra "
+ "travertina, ladrilho e tufo (pedra calcária com grandes\nporos). A sua planta "
+ "elíptica mede dois eixos que se estendem aproximadamente de 190 metros por 155\n" 
+ "metros. A fachada compõe-se de arcadas decoradas com colunas dóricas, jónicas e "
+ "coríntias, de acordo com\no pavimento em que se encontravam, Os assentos eram "
+ "em mármore e a cavea, escadaria ou arquibancada,\ndividia-se em três partes, "
+ "correspondentes às diferentes classes sociais: o pódio, para as classes\naltas; "
+ "as maeniana, sector destinado à classe média; e os portici, ou pórticos, "
+ "construídos em madeira,\npara a plebe e as mulheres.");
                    break;
                case 105:
                    System.out.println("Ruinas de Petra, em Jordânia");
System.out.println("-----------------------------------------------------------");
                    System.out.println("Estabelecido possivelmente já em 312 a.C. "
+ "como a capital dos árabes nabateus. A cidade é famosa por sua\narquitetura "
+ "esculpida em rocha e por seu sistema de canalização de água. Outro nome para "
+ "Petra é Cidade\nRosa, devido à cor das pedras do local");
                    break;
                case 106:
                    System.out.println("Taj Mahal, na Índia");
System.out.println("-----------------------------------------------------------");
                    System.out.println("o Taj Mahal é também conhecido como a "
+ "maior prova de amor do mundo, contendo inscrições retiradas do\nAlcorão. É"
+ " incrustado com pedras semipreciosas, tais como o lápis-lazúli entre outras. "
+ "A sua cúpula é\ncosturada com fios de ouro. O edifício é flanqueado por duas"
+ " mesquitas e cercado por quatro minaretes.");
                    break;
                case 107:
                    System.out.println("Grande Muralha da China");
System.out.println("-----------------------------------------------------------");
                    System.out.println("é uma série de fortificações feitas de "
+ "pedra, tijolo, terra compactada, madeira e outros materiais,\ngeralmente "
+ "construída ao longo de uma linha leste-oeste toda a muralha, com todos os seus"
+ " ramos, mede 21.196 km.\nA construção da grandiosa muralha teve início em 221 "
+ "a.C., data do início da Dinastia Qin. O\nintuito inicial era a construção de "
+ "um muro de 5.000 quilômetros para proteger o território. Dinastias\nposteriores"
+ " continuaram a gigantesca construção e, mesmo embora as partes reconhecíveis "
+ "da muralha datem dos\nséculos XIV a XVII d.C., pode-se afirmar que a construção"
+ " levou 1.800 anos para ficar pronta. Outro detalhe\ninteressante é que partes "
+ "do muro ainda são descobertas atualmente; em 2012 arqueólogos localizaram partes"
+ " do\nmuro na fronteira com a Mongólia.");
                    break;
                default:
                    
                    break;   
                    
            }
    }
}
