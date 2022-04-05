
package com.mycompany.projeto3;


public class VerificarPrimo {
    void exibirPrimo(Integer number) {
        Boolean primo = false;
        for (int i = 3; i < number; i++) {
            if (number % i == 0) {
                primo = false;
                break;
            } else {
                primo = true;
            }
        }
        if (primo == true) {
            System.out.println("Esse número é primo!");
        } else {
            System.out.println("Esse número não é primo!");
        }
    }
}
