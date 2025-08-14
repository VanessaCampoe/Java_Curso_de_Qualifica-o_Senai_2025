package com.regras.app;

import java.util.Scanner;

import com.regras.model.Conta;

public class App {
    //  implementar interface 

    public static void main(String[] args) throws Exception {
        Conta cc = new Conta("Fulano", "123.456.789-00", "Agencia", "0001", 0);
        Scanner leia = new Scanner(System.in);
        // System.out.println("Saldo da conta R$" + cc.getSaldo());

        // complete o codigo fonte 

        int opcao;
        double valor ;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir Dados");
            System.out.println("0 - Sair");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    valor = leia.nextDouble();
                    cc.fazerDeposito(valor);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    valor = leia.nextDouble();
                    cc.fazerSaque(valor);
                    break;
                case 3:
                    cc.exibirDados();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        leia.close();
    }
}
