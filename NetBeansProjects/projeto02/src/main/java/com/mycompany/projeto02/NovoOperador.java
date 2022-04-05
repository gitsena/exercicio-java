package com.mycompany.projeto02;

public class NovoOperador {

    public static void main(String[] args) {

        String nome = "Andre Sena";
        Boolean professor = true;

        if (professor) {
            System.out.println(
                    String.format("%s é professor", nome));
        } else {
            System.out.println(
                    String.format("%s Não professor", nome));
        
    }
        //System.err.println("resultado");
    //Operador ternário é "um if else de uma linha"    }
    // resultado = isProfessor ? "Sim é Professor":"Não, é impostor";
    }      
}
