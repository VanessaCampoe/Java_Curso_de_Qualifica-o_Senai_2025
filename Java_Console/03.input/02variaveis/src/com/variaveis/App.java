package com.variaveis;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instância do objeto da entrada de dados
        Scanner leia = new Scanner(System.in);

        String nome;
        String email;
        int idade;

        // input(entrada de dados)
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();

        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();

        // limpeza de buffer/prepara o computador pra receber String novamente (SEMPRE USAR DEPOIS da troca de String para Int, para receber String novamente)
        leia.nextLine();

        System.out.println("Informe seu email: ");
        email = leia.nextLine();

        // output (saidade de dados)
        System.out.println("Nome: "+ nome +".");
        System.out.println("idade: "+ idade +".");
        System.out.println("email: "+ email +".");

        // fechar o objeto
        leia.close();
    }
}