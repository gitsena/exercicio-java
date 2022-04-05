package com.mycompany.projeto.poo1;

public class TesteEncomenda {

    public static void main(String[] args) {
        Encomenda etiqueta1 = new Encomenda("P", "Rua Taboão nº30",
                "Av Ipiranga 478", 400.0, 50.0);
        Encomenda etiqueta2 = new Encomenda("M", "Rua Apatito nº25",
                "Av Japão 200", 47.0, 30.0);
        Encomenda etiqueta3 = new Encomenda("G", "Rua Gomes nº30",
                "Av Brasilia 2.943", 200.0, 100.0);

        etiqueta1.calcularFrete();
        etiqueta1.emitirEtiqueta();

        etiqueta2.calcularFrete();
        etiqueta2.emitirEtiqueta();

        etiqueta3.calcularFrete();
        etiqueta3.emitirEtiqueta();
    }
}
