package com.escolha.app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        int x, y;
        double result;
        String operacao;

        System.out.println("informe o valo de x :");
        x = leia.nextInt();
        System.out.println("informe o valo de y :");
        y = leia.nextInt();
        // limpeza de buffer
        leia.nextLine();

        // menu
        System.out.println("Escolha a operação ");
        System.out.println("1- Somar");
        System.out.println("2 - Subtrair ");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - dividir");
        System.out.println("Operação ");
        operacao = leia.nextLine();


        // escolha caso 
        switch (operacao) {
            case "1":
                result = x+y;
                System.out.println("O resultado do sama e:" + result);
                break;


            case "2":
                result = x-y;
                System.out.println("O resultado do sama e:" + result);
                break;


            case "3":
                result = x*y;
                System.out.println("O resultado do sama e:" + result);
                break;


            case "4":
                result = x/y;
                System.out.println("O resultado do sama e:" + result);
                break;


            default:
                System.out.println("Operação inválida");
        }
                
        

            leia.close();



    }
    }

