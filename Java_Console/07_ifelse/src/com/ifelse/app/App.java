package com.ifelse.app;


import java.util.Scanner;
//import java.util.Locale;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);


        // operador ternario 
        // declaração de variaveis
        String nome;
        int idade;

        //input
        //Locale.setDefault(Locale.US);
        // entrada de dados
        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();
        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();


        // ternario 
        System.out.println(nome + ((idade >= 18) ? " é maior de idade." : " é menor de idade."));

}//aqui e igual ao programa anterior , aqui o ternario limpa basntade o dcodio , serve para silplificar o ifelse 
 
}
