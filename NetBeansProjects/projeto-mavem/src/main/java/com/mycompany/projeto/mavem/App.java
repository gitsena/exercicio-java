
package com.mycompany.projeto.mavem;

import com.github.britooo.looca.api.core.Looca;
import com.github.javafaker.Faker;
import java.util.Locale;


public class App {
    public static void main(String[] args) {
        
       Faker faker = new Faker(new Locale("pt-BR"));
        System.out.println(faker.name().fullName());
        System.out.println(faker.pokemon().name());
        
        Looca looca = new Looca();
        System.out.println(looca.getSistema());
            
        
    }
}
