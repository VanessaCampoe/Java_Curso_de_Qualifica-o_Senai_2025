package com.repeticao.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        
        String nome;
        int idade,opcao;
        double altura;

        //  faça ... enquanto do
        do{
            //menu - 
            System.out.println("1 Registar nova entrada ");
            System.out.println("2 Listar entradas ");
            System.out.println("Informa a opçao desejada ");
           
            opcao = leia.nextInt();
            
            if (opcao == 1 ){
              // || essea barra e o or , q siginifica ou
            leia.nextLine();
            System.out.println("Informe nome: ");
            nome = leia.nextLine();
            System.out.println("Informe a idade: ");
            idade = leia.nextInt();
            System.out.println("Informe a altura: ");
            altura = leia.nextDouble();

            //  verificar a altura 
            if (idade >= 12 && altura >= 1.15){
                System.out.println("Pode entrar ");
            } 


            }
            else if (opcao != 2){

                System.out.println(("Opção inválida "));

            }
              
            
        } while(opcao != 2);


        leia.close();
 




    
    }
}






    