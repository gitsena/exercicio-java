
package com.mycompany.projeto02;

import java.util.concurrent.ThreadLocalRandom;


public class Randomicos {
    
    public static void main(String[] args) {
        
        Integer numero = ThreadLocalRandom.current().nextInt(0, 100);
        
        System.out.println(String.format("Numero gerado: %d",numero));
       
       
    } 
          
}
