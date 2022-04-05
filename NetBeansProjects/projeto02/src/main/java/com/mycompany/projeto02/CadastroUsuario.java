package com.mycompany.projeto02;

import java.util.Scanner;

/**
 *
 * @author andre.dias.de.sena
 */
public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Login:");
        String login = leitorTexto.nextLine();

        System.out.println("Senha:");
        String senha = leitorTexto.nextLine();

        System.out.println("Tentativas antes do bloqueio:");
        Integer tentativas = leitorNumero.nextInt();
        
        String frase = String.format("Seu login é %s e sua senha é %s Você tem %d "
                + "tentativas antes de ser bloqueado", login, senha, tentativas);
        System.out.println(frase);

    }
}
