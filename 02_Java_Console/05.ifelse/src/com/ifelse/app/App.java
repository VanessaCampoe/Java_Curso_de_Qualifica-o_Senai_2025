package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Scanner leia = new Scanner (System.in);
        // declaração de variavel
        String nome;
        int idade;
        double altura;

        // entrada de dados
        System.out.println("Digite seu nome ;   ");
        nome = leia.nextLine();
        System.out.println("Digite sua idade ;   ");
        idade = leia.nextInt();   // aqui voce errou o nextint pq colocou nextline , vo ce deve observar o tipo de variavel
        System.out.println("Digite sua altura ;   ");
        altura = leia.nextDouble();
       


        // estrutura de decisão 
        if (idade >= 12 && altura >= 1.15){
            System.out.println(nome + " Esta autorizado");
                    
        }
        else {
            System.out.println(nome + " Nao esta autorizado");
        }


        //  fecha obejeto leia 
        leia.close();

    }
}
