package com.mycompany.projeto.poo1;

public class Encomenda {

    private String tamanho;
    private String enderecoRemetente;
    private String enderecoDestinatorio;
    private Double distancia;
    private Double valorEncomenda;

    public Encomenda(String tamanho, String enderecoRemetente, 
            String enderecoDestinatorio, Double distancia, Double valorEncomenda) {
        this.tamanho = tamanho;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatorio = enderecoDestinatorio;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
    }
    Double valorFrete = 0.0;
    Double valorTotal = 0.0;

    //Método calcular frete
    public void calcularFrete() {
        Double calculandoFrete = 0.0;
        if (this.tamanho.equals("P")) {
            calculandoFrete = this.valorEncomenda * 1 / 100;
        } else if (tamanho.equals("M")) {
            calculandoFrete = this.valorEncomenda * 3 / 100;
        } else {
            calculandoFrete = this.valorEncomenda * 5 / 100;
        }

        System.out.println("Calculando o frete ...!");

        if (this.distancia <= 50) {
            this.valorFrete = calculandoFrete + 3.0;
        } else if (this.distancia == 51 || this.distancia <= 200) {
            this.valorFrete = calculandoFrete + 5.0;
        } else {
            this.valorFrete = calculandoFrete + 7.0;
        }
        
        this.valorTotal = this.valorEncomenda + this.valorFrete;
    }

    //Metodo emitir etiqueta
    public void emitirEtiqueta() {
        System.out.println(String.format("**** ETIQUETA PARA ENVIO *****\n"
                + "\n"
                + "Endereço do remetente: %s\n"
                + "\n"
                + "Endereço do destinatário: %s\n"
                + "\n"
                + "Tamanho: %s\n"
                + "\n"
                + "--------------------------------------------------\n"
                + "\n"
                + "Valor encomenda: R$ %.2f\n"
                + "\n"
                + "Valor frete: R$ %.2f\n"
                + "\n"
                + "--------------------------------------------------\n"
                + "\n"
                + "Valor total: R$ %.2f", this.enderecoRemetente,
                this.enderecoDestinatorio, this.tamanho, this.valorEncomenda,
                this.valorFrete, this.valorTotal));
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        if (this.tamanho.equals("P")) {
            this.tamanho = "Pequeno";
        } else if (tamanho.equals("M")) {
            this.tamanho = "Médio";
        } else {
            this.tamanho = "Grande";
        }
        this.tamanho = tamanho;
    }

    public String getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(String enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public String getEnderecoDestinatorio() {
        return enderecoDestinatorio;
    }

    public void setEnderecoDestinatorio(String enderecoDestinatorio) {
        this.enderecoDestinatorio = enderecoDestinatorio;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getValorEncomenda() {
        return valorEncomenda;
    }

    public void setValorEncomenda(Double valorEncomenda) {
        this.valorEncomenda = valorEncomenda;
    }

}
