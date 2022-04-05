package com.mycompany.projeto.encapsulamento;

public class App {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("#123", "André", "ADS");
        Aluno aluno2 = new Aluno("#123", "ADS");
        /*    
        aluno1.ra = "#123";
        aluno1.nome = "Manuel";
        aluno1.curso = "Análise e desenvolvimento de sistema";
        aluno1.nota1 = 10.0;
        aluno1.nota2 = 8.0;

        System.out.println(String.format("Ra: %s", aluno1.ra));
        System.out.println(String.format("Nome: %s", aluno1.nome));
        System.out.println(String.format("Curso: %s", aluno1.curso));
        System.out.println(String.format("Nota 1: %.1f", aluno1.nota1));
        System.out.println(String.format("Nota 2: %.1f", aluno1.nota2));
        System.out.println(String.format("Média é: %.1f",
                (aluno1.nota1 + aluno1.nota2) / 2));
         */
       /* aluno1.setRa("#123");
        aluno1.setNome("André");
        aluno1.setCurso("ADS");
        aluno1.setNota1(10.0);
        aluno1.setNota2(8.0);
        */

        /*
        //metodo encapsulado utilizando private e (get/set)
        System.out.println(String.format("ra é: %s", aluno1.getRa()));
        System.out.println(String.format("Nome é: %s", aluno1.getNome()));
        System.out.println(String.format("Curso é: %s", aluno1.getCurso()));
        System.out.println(String.format("Nota 1 é: %.1f", aluno1.getNota1()));
        System.out.println(String.format("Nota 2 é: %.1f", aluno1.getNota2()));
        System.out.println(String.format("Média é: %.1f", aluno1.getMedia()));
         */
        System.out.println(aluno1);
        
    }

}
