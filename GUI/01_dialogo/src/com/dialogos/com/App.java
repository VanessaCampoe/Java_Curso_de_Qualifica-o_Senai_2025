package com.dialogos.com;

import javax.swing.JOptionPane;

import com.dialogos.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // JOptionPane.showMessageDialog(null, "Olá mundo!", "Programa helloWorld", JOptionPane.INFORMATION_MESSAGE); foi so um teste
        Pessoa usuario = new Pessoa (null, 0);

        //  caixade input 
        usuario.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
        usuario.setIdade(Integer.parseInt((JOptionPane.showInputDialog("Digite sua idade:"))));

        //  aqui ele recebe e armazena a idade mostra a idade na tela de alert

        //  caixa de output

        JOptionPane.showMessageDialog(null, "Nome: " + usuario.getNome(), "\nIdade" +usuario.getIdade(),JOptionPane.INFORMATION_MESSAGE);

        //  aqui ele recebe e armazena o nome mostra o nome na tela  de alert 
//  cada caixa recebe so um input , entao cada caixa deve receber um caixa 




    }
}
//  observe o erro de abrir a pasta  
//  e nao faça mais 