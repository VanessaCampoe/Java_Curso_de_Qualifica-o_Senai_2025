package com.imc.app;
import javax.swing.JOptionPane;
import com.imc.model.IMC; // Certifique-se de que o caminho do pacote está correto

public class App {
    public static void main(String[] args) throws Exception {
        IMC imc = new IMC(0.0,0.0);

        double imcValor = imc.calcularIMC();
        String[] opcoes = {"Calcular IMC", "Sair"};
        Object opcao;

        do {
            opcao = JOptionPane.showInputDialog(null, "Escolha uma opção desejada ", "IMC", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]
            
            );
            //  nao coloco o else pq e sair do programa
            if (opcao == "Calcular IMC") {
                imc.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso (kg): ").replace(",", ".")));
                //  set peso agor ao set altura 
                
            
                imc.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros: ").replace(",", ".")));

                imcValor = imc.calcularIMC();

                JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imcValor)  + "\n" + imc.diagnostico(imcValor), "IMC Resultado", JOptionPane.INFORMATION_MESSAGE);
            }

        } while (opcao != "Sair");
    
}
    }


