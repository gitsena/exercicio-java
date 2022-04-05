package com.mycompany.projeto.encapsulamento;

public class RecursosHumanos {

    // Atributos do RH
    private Integer totalPromovidos;
    private Integer totalReajustados;

    // Construtor não precisa receber nenhum argumento por regra de negocio
    // inicia com 0, 
    public RecursosHumanos() {
        this.totalPromovidos = 0;
        this.totalReajustados = 0;
    }

    // métodos comportamentos de um RH
    public void reajustarSalario(Colaborador colab, Double valorReajuste) {
        this.totalReajustados++;
        Double novoSalario = colab.getSalario() + valorReajuste;
        colab.setSalario(novoSalario);
    }

    public void promoverColaborador(Colaborador colab, String novoCargo,
            Double novoSalario) {
        Double salarioAtual = colab.getSalario();
        if (salarioAtual < novoSalario) {
            totalPromovidos++;
            colab.setCargo(novoCargo);
            colab.setSalario(novoSalario);

        } else {
            System.out.println("Não tente pagar menos "
                    + "para o colaborador! ò_o´");
        }

    }

    //Get e SET já que os atributos são privados
    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

  

    public Integer getTotalReajustados() {
        return totalReajustados;
    }

   

    @Override
    public String toString() {
        return "Relatorio\n RecursosHumanos{" + "\ntotalPromovidos:" 
                + totalPromovidos + ", \ntotalReajustados:" + totalReajustados + '}';
    }

}
