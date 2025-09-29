package com.ifelse.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        // leia aqui vai ser meu objeto 
        //instancia do scannerobjeto  insta da classa 
        Scanner leia = new Scanner(System.in);  //path


       // System.out.println("Hello, World!");


       // declaração de variaveis
        String nome;
        double nota;
        
        
        // input
        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite sua nota: ");
        nota = leia.nextDouble();

        // output
        if (nota >= 7) {
            System.out.println(nome + " voce esta aprovado" );
        }
        else if (nota >= 5) { // observar a diferença entere python e java aqui e else if e nopython elif
            System.out.println(nome + " voce esta de recuperacao" );
        } else {
            System.out.println(nome + " voce esta reprovado" );
        }
        // fechar o scanner fchar  objeto 
        leia.close();

    }
}

//sar do switch case
        
    