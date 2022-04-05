package com.mycompany.projetopetshop;

public class TestPetShop {

    public static void main(String[] args) {
        // Criando Pets com suas caracteristicas
        Pet pet1 = new Pet("Pingo", "Buldogue");
        Pet pet2 = new Pet("Holly", "Husky Siberiano");
        Pet pet3 = new Pet("Bob", "Chow-chow");

        // Criando os Pet Shop
        PetShop petShop1 = new PetShop("BATH THE DOG");

        // exibir as informações do Pet1 e do PetShop1
        System.out.println(pet1);
        System.out.println(petShop1);

        // Dar 1 banhos no Pet 1
        petShop1.darBanho(pet1);
        System.out.println(pet1);

        // Dar 2 banhos no pet 2
        petShop1.darBanho(pet2);
        petShop1.darBanho(pet2);
        System.out.println(pet2);

        // dar 3 banho no pet 3
        petShop1.darBanho(pet3);
        petShop1.darBanho(pet3);
        petShop1.darBanho(pet3);
        System.out.println(pet3);
        
        
        // exibir as informações de cada Petseparadamente

        // exibir as informações do PetShop para ver o faturamento final
        System.out.println(petShop1);

    }

}
