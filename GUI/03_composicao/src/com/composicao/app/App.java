package com.composicao.app;

import javax.swing.JOptionPane;

import com.composicao.model.Conta;
import com.composicao.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new  Pessoa(null, null, null, null, null);
        Conta cc = new Conta("12354", "12578", 0, usuario);


        String[] opcoes = {"Exibir dados da conta", "Fazer deposito ", " fazer Sacar", "Sair"};    
        Object opcao; 
        double valor;  



  // input do titlar da conta 
usuario.setNome(JOptionPane.showInputDialog("nome do titular da conta"));
usuario.setCpf(JOptionPane.showInputDialog("CPF do titular da conta"));
usuario.setEmail(JOptionPane.showInputDialog("Email do titular da conta"));
usuario.setTelefone(JOptionPane.showInputDialog("Telefone do titular da conta"));
usuario.setEndereco(JOptionPane.showInputDialog("Endereco do titular da conta"));
        do { opcao = JOptionPane.showInputDialog(null, "Escolha uma opção", "Java Banck", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);



            switch ( opcao.toString()) {
                case "Exibir dados da conta": JOptionPane.showInternalMessageDialog(null,cc.exibirDados(), null, JOptionPane.QUESTION_MESSAGE
                );
                break;
                case "Fazer deposito":
                valor =  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));
                JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso! \nSaldo atual: " + cc.fazerDeposito(valor),"Deposito",JOptionPane.INFORMATION_MESSAGE);


                    

                    break;
                case "fazer Sacar":
                    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
                    cc.fazerSaque(valorSaque);
                    JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! Saldo atual: " + cc.getSaldo());


            //         break;
            //     case "Fazer deposito":
            //         double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));
            //         cc.fazerDeposito(valorDeposito);
            //         JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso! Saldo atual: " + cc.getSaldo());
            //         break;
            //     case "fazer Sacar":
            //         double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
            //         cc.fazerSaque(valorSaque);
            //         JOptionPane.showMessageDialog(null, "Saque realizado com sucesso! Saldo atual: " + cc.getSaldo());
            //         break;
            //     case "Sair":
            //         JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema!");
            //         break;
            //     default:
            //         JOptionPane.showMessageDialog(null, "Opção inválida!");
            // }


            }


        }while (opcao != "Sair");

    }

}


// olha aqui da dev pelo nobiot escolhi a pasta gui e fiz o pack
// depois em src novo pack mapara o model ele no final tem model ao inves de app
// depois de ter criado cada m temos 3 packts e app interfaces e model