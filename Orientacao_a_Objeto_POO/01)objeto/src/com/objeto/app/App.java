package com.objeto.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        //TODO - 
        // intancia a classe Pessoa 
        Pessoa usuario = new Pessoa("", 0, 0);
        Scanner leia = new Scanner(System.in);
        // vamo criar um usuario 
        // DEFINE OS VALORES DOS ATRIBUTOS 

        System.out.print("Digite o nome: ");
        usuario.nome = leia.nextLine();
        System.out.print("Digite a idade: ");
        usuario.idade = leia.nextInt();
        System.out.print("Digite a altura: ");
        usuario.altura = leia.nextDouble();

        // output
        System.out.println(usuario.cumprimentar());
        usuario.exibirDados();  // aqui nos criamos no usuario

    }
}
