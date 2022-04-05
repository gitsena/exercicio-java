package com.mycompany.projeto3;

public class DescontoProgressivo {

    Double somar(Double valor, Integer quantidade) {
        return valor * quantidade;
    }

    Double desconto(Double soma, Double porcentagem) {
        return soma * porcentagem;
    }

    void desconto(Double valor, Integer quantidade) {
        ExibirNotaFiscal exibir = new ExibirNotaFiscal();

        Double soma = somar(valor, quantidade);

        soma = valor * quantidade;
        Double valorApagar = soma;
        Double desconto = 0.0;
        
        if (quantidade == 1) {
            desconto = desconto(soma, 0.1);
        } else if (quantidade == 2) {
            desconto = desconto(soma, 0.2);
        } else if (quantidade >= 3) {
            desconto = desconto(soma, 0.3);
        }
        exibir.nota(valor, quantidade, soma, desconto, valorApagar);
    }
}
