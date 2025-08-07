// package com.atividade01dowhile.app;
// public class App {
//     public static void main(String[] args) throws Exception {
//         // TODO
//         /* 
//          * crie um programa que receba o nome , peso e altura do usuario , 
//          * e calcule o valor do seu IMc (Indice de massa corporal), 
//          * cujo formula e peso /altura * altura, informe seu diagnostico 
//          * baseado na tabela do imc (pessquisar na internt)
//          * o programa pode calcular o IMC de varios usuarios 
//          * e devera ter a opçao de sair do programa 
//          */
//         /*!SECTION*!SECTION*/ 
//         java.util.Scanner scanner = new java.util.Scanner(System.in);


    // ATIVIDADE - CALCULAR IMC:

/* Crie um programa que receba o nome, peso e altura do usuário, e calcule o valor do seu IMC, cuja fórmula é peso/altura*altura, e informe o seu diagnóstico baseado na tabela do IMC. 
 O programa poderá calcular o IMC de vários usuários e deverá ter a opção de sair de programa.
 */

package com.atividade01dowhile.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
//instancia do objeto:
        Scanner leia = new Scanner (System.in);

//declaração de variáveis:
        String nome, opcao, diagnostico;
        double peso, altura, imc;
        int saida = 0;

//loop
        do{
                System.out.println("1- Calcular IMC");
                System.out.println("2 - Sair do programa");
                System.out.println("Escolha a opção:");
                opcao = leia.nextLine();

                switch (opcao) {
                        case "1":
                                System.out.println("Informe seu nome: ");
                                nome = leia.nextLine();
                                System.out.println("Informe seu peso(kg): ");
                                peso = leia.nextDouble();
                                System.out.println("Informe sua altura(m): ");
                                altura = leia.nextDouble();

                                imc = peso / (altura * altura);

                                System.out.println("O IMC de " + "é " + String.format("%.2f", imc) + ".");

                        // ternário:
                                diagnostico = (imc < 18.5) ? nome + "está abaixo do peso."
                                : (imc < 25) ? nome + "está no peso ideal."
                                : (imc < 30) ? nome + "está com sobrepeso"
                                : (imc < 35) ? nome + "está com obesidade grau I"
                                : (imc < 40) ? nome + "está com obesidade grau II"
                                : nome + "está com obesidade grau III";
                                System.out.println(diagnostico);
                                break;
                        case "2":
                                saida = Integer.parseInt(opcao);
                                System.out.println("Programa encerrado");                                
                                break;                
                        default:
                                System.out.println("Opção inválida.");
                                break;
                }
        }while (opcao != "2");
        


        
//fecha objeto Scanner - leia
        leia.close();
    }
}



