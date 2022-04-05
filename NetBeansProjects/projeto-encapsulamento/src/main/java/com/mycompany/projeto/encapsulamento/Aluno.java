package com.mycompany.projeto.encapsulamento;

public class Aluno {

    private String ra;
    private String nome;
    private String curso;
    private Double nota1;
    private Double nota2;

    public Aluno(String ra, String nome, String curso) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    public Aluno(String ra, String curso) {
        this.ra = ra;
        this.curso = curso;
    }

    // uma forma mais pratica de imprimir a lista alt + insert 
    @Override
    public String toString() {
        return "\nra: " + ra + ", \nnome: " + nome + ", \ncurso: "
                + curso + ", \nnota1: " + nota1 + ", \nnota2: " + nota2;
    }

    // criando outro metodo para calcular média
    public Double getMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    // Métodos seguem o padrão;
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        if (nota1 > 0 && nota1 <= 10) {
            this.nota1 = nota1;
        }
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        if (nota2 > 0 && nota2 <= 10) {
            this.nota2 = nota2;
        }
    }

    public Boolean isAprovado() {
        // return  getMedia() > 6; maneira mais curta

        Double media = getMedia();
        if (media > 6) {
            return true;
        } else {
            return false;

        }

    }
}
