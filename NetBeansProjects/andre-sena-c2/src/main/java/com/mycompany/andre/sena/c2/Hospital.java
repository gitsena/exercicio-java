package com.mycompany.andre.sena.c2;

public class Hospital {

    //Atributos
    private String nome;
    private Integer quantidadeDePagamento;
    private Integer quantidadeDeBonus;

    public Hospital(String nome) {
        this.nome = nome;
        this.quantidadeDePagamento = 0;
        this.quantidadeDeBonus = 0;
    }

    //Métodos 
    public void realizarPagamento(Medico medico, Double salarioAserPago) {
        String validar;
        quantidadeDePagamento ++;
        if (medico.getAtivo() == false) {
            validar = "Não";
            System.out.println("\nOperação inválida");
        } else {
            validar = "Sim";
            System.out.println(String.format("Realizando pagamento sem bônus"
                    + "\nValor do pagamento: R$%.2f"
                    + "\n"
                    + "\nID: %d"
                    + "\nAtivo: %s"
                    + "\nNome:%s "
                    + "\nEspecialidade: %s"
                    + "\nValor a receber: R$%.2f",
                    salarioAserPago,
                    medico.getId(),
                    validar,
                    medico.getNome(),
                    medico.getEspecialidade(),
                    salarioAserPago));
        }
    }

    // Sobrecarga do metodo Realizar Pagamento
    public void realizarPagamento(Medico medico, Double salarioAserPago,
            Double valorBonus) {
        quantidadeDeBonus ++;
        salarioAserPago = medico.getSalario() + 30 / 100;

        // OBS devido ao tempo não cnsegui finalizar a sobrecarga;
    }

    // Método desligar Médico
    public void desligarMedico(Medico medico) {
        medico.setAtivo(false);
        System.out.println(String.format("O Médico %s foi desligado",
                medico.getNome()));

    }

    // Get & Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeDePagamento() {
        return quantidadeDePagamento;
    }

    public void setQuantidadeDePagamento(Integer quantidadeDePagamento) {
        this.quantidadeDePagamento = quantidadeDePagamento;
    }

    public Integer getQuantidadeDeBonus() {
        return quantidadeDeBonus;
    }

    public void setQuantidadeDeBonus(Integer quantidadeDeBonus) {
        this.quantidadeDeBonus = quantidadeDeBonus;
    }

    @Override
    public String toString() {
        return String.format("\n%s"
                + "\nQuantidade de pagamento: %d"
                + "\nQuantidade de bônus: %d",
                nome, quantidadeDePagamento, quantidadeDeBonus);
    }

}
