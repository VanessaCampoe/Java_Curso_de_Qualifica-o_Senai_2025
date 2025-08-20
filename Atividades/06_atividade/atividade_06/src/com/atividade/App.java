package com.atividade;

import com.atividade.model.Pessoa;
import com.atividade.model.Veiculo;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Aqui o programa começa
        
        String nome = JOptionPane.showInputDialog("Digite o nome do proprietário:");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do proprietário:");

        Pessoa proprietario = new Pessoa(nome, cpf);

        String marca = JOptionPane.showInputDialog("Digite a marca do veículo:");
        String modelo = JOptionPane.showInputDialog("Digite o modelo do veículo:");
        String placa = JOptionPane.showInputDialog("Digite a placa do veículo:");

        Veiculo veiculo = new Veiculo(marca, modelo, placa, proprietario);

        String mensagem = "Dados do veículo:\n" +
                "Marca: " + veiculo.getMarca() + "\n" +
                "Modelo: " + veiculo.getModelo() + "\n" +
                "Placa: " + veiculo.getPlaca() + "\n\n" +
                "Proprietário:\n" +
                "Nome: " + veiculo.getProprietario().getNome() + "\n" +
                "CPF: " + veiculo.getProprietario().getCpf();

        JOptionPane.showMessageDialog(null, mensagem);
    }
}

        
        /*!SECTION
         * Crie uma aplicação onde o usuario cadastra seus dados pessoias  e os dados do seu veiculos pessoal , e o programa exibe os dados do veiculos na tela . 
         * NOTE use o conceito de composição onde um dos atributos de veiculos e o proprietario. 
         */







        //  System.out.println("Dados do Proprietário:");
        //  System.out.println("Nome: " + proprietario.getNome());
        //  System.out.println("Idade: " + proprietario.getIdade());
        //  System.out.println("CPF: " + proprietario.getCpf());

        //  System.out.println("\nDados do Veículo:");
        //  System.out.println("Modelo: " + veiculo.getModelo());
        //  System.out.println("Ano: " + veiculo.getAno());
        //  System.out.println("Placa: " + veiculo.getPlaca());
        //  JOptionPane

// exercicio de composição  
// na pasta src criar o package
//     com.atividade06.model



    
