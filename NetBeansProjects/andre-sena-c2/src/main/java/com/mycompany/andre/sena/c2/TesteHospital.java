package com.mycompany.andre.sena.c2;

public class TesteHospital {

    public static void main(String[] args) {
        // Criando dois objetos médicos com suas caracteristicas 
        Medico medico1 = new Medico(1, "André Dias", "Oncologista");
        Medico medico2 = new Medico(2, "Debora Silva", "Dermatologista");

        // Criando um objeto Hospital
        Hospital hospital = new Hospital("Hospital Ipiranga");

        //Exibindo as infomações do Médico
        System.out.println(medico1);
        System.out.println(medico2);

        //Realizando pagammento do primeiro médico
        hospital.realizarPagamento(medico1, 2000.0);

        //realize o desligamento do primeiro médico
        hospital.desligarMedico(medico1);

        // Realize o pagamento do primeiro médico novamente
        hospital.realizarPagamento(medico1, 2000.0);
        
        // Exibindo novamente as informações dos médicos
        System.out.println(medico1);
        System.out.println(medico2);
        
        // Exibir as informações do hospital
        System.out.println(hospital);
    }
}
