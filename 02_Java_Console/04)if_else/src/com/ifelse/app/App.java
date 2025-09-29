package com.ifelse.app;
//  aqui devo importar odepois do package e antes da class
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!"); apagar essas parte 
        //  introdução ao scanner 

        Scanner leia = new Scanner(System.in);

        // declaração de variavel 
        String nome;
        int idade;

        // input 
        System.out.println("Informe seu nome ");
        nome  = leia.nextLine();
        System.out.println("Informe sua idade ");
        idade = leia.nextInt();

        // estrutura de controle if else
        if(idade >= 18) {
            System.out.println(nome + "Você é maior de idade. ");
        } else {
            System.out.println(nome + "Você é menor de idade. ");
        }











        //  fecha objeto leia 
        leia.close();
    }
}
