package com.calculadora.app;

import javax.swing.JOptionPane;

import com.calculadora.controller.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora(0, 0);

        String[] opcoes = {
            "Somar",
            "Subtrair",
            "Multiplicar",
            "Dividir",
            "Sair"
        };
        Object opcao; 

        do {
                opcao = JOptionPane.showInputDialog(
                    null,
                "Selecione uma opçao",
                "calculadora",
                JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

                    if (opcao != "Sair") {
                            calculadora.setX(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de x:")));

                            calculadora.setY(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de y:")));

                    if (opcao == "Somar"){ 
                         // tradicional sem o ternario 
                         JOptionPane.showMessageDialog(null, "Resultado da soma é: " + calculadora.somar(calculadora.getX(), calculadora.getY()), "Soma", JOptionPane.INFORMATION_MESSAGE);

                    }
                    else if (opcao == "Subtrair") {
                        JOptionPane.showMessageDialog(null, "Resultado da subtração é: " + calculadora.subtrair(calculadora.getX(), calculadora.getY()), "Subtração", JOptionPane.INFORMATION_MESSAGE);

                    } else if (opcao == "Multiplicar") {
                        JOptionPane.showMessageDialog(null, "Resultado da multiplicação é: " + calculadora.multiplicar(calculadora.getX(), calculadora.getY()), "Multiplicação", JOptionPane.INFORMATION_MESSAGE);

                    } else if (opcao == "Dividir") {
                        if (calculadora.getY() != 0) {
                            JOptionPane.showMessageDialog(null, "Resultado da divisão é: " + calculadora.dividir(calculadora.getX(), calculadora.getY()), "Divisão", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.", "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                    }


                      
                       
                
                   }




       } while (opcao != "Sair");
    }
}



//  com return controller 
//  model representa as operações do banco 
//  controller faz a trasnferencia de dados 
//  quando eu crio um model  controleler ele precisa que eu abra um classe ou um interce para abrir cum aquivo 
