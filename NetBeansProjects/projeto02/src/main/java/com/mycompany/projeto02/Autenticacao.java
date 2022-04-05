
package com.mycompany.projeto02;

import java.util.Scanner;

/*
* Elaborar um programa java que simule a autenticação 
* de um usuário em um sistema. Solicite o nome de usuário e senha.
* Enquanto o nome for diferente de “admin” e a senha for diferente de “#Bandtec” 
* exiba: “Login e/ou senha inválidos” e solicite novamente.
* Caso o usuário digite os campos corretamente, exiba: “Login realizado com sucesso”
 */
public class Autenticacao {

    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner(System.in);
        String nomeUsuario, senha;

        System.out.println("Nome Usuário:");
        nomeUsuario = leitorTexto.nextLine();

        System.out.println("Senha:");
        senha = leitorTexto.nextLine();

        while (!nomeUsuario.equals("admin") || !senha.equals("#Bandtec")){
            System.out.println("ERROR!,Usuário ou Senha Incorretos!"
                    + "\n Tente Novamene!"
                    + "\n Nome do Usuario:");
            nomeUsuario = leitorTexto.nextLine();
            System.out.println("Senha:");
            senha = leitorTexto.nextLine();
        }

        System.out.println("Login inserido corretamente \n Seja bem vindo!");

    }
}
