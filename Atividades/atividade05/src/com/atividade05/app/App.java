package com.atividade05.app;
public class App {
    public static void main(String[] args) throws Exception {
        // *
        /*Crie um app para verificar uqla o melhor combustivel  para um carro flex abastecer
        note:
         compensa mais abastecer com etanol caso o valor dele seja ate 70 do valor da gasolina . 

        
        
        */



        double gasolina = inputGasolina(" Informe o valor da gasolina ");
        double etanol = inputEtanol(" Informe o valor do etanol ");

        if (etanol <= gasolina * 0.7) {
            System.out.println("Abastecer com etanol é a melhor opção.");
        } else {
            System.out.println("Abastecer com gasolina é a melhor opção.");
        }
    }

    private static double inputGasolina(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inputGasolina'");
    }

    private static double inputEtanol(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inputEtanol'");
    }
}
