
package com.mycompany.projeto.poo1;


public class testeEmpregado {
    public static void main(String[] args) {
     // instancia
     Empregado func1 = new Empregado(
             "João Pedro", "Analista de Sistemas", 5400.00);
     Empregado func2 = new Empregado(
             "André Silva", "Segurança de Dados", 12000.00);
     
     
     func1.reajusteSalario();
        System.out.println(func1);
        
     func2.reajusteSalario();
        System.out.println(func2);
    }
}