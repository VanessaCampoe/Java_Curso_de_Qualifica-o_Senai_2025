  // TOTO 
        /*
         * Crie um app no java em que usuario informa o nome e usuario e a idade e o programa exibe 5 salas de cinema , cada uma exibe um filme com classificaçai indicativa 
         * o usuario devera escolher a sala de acordo com o filme desenjando , e se  o usuario iver idade para  ver o filme o progrma imprime o ingresso e encerra . Caso o usuario  nao tenha a idade ninima , o programa proibe a entrada e pede para escolheroutro filme 
         * 
         */
package com.atividade02if.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // instancia de objeto
        Scanner leia = new Scanner (System.in);



        // o que se pede no prormagra que devo fazer e estabelececer primeiro as informações que vou pegar do usurio 
        // e depois as informações que o programa vai exibir para o usuario
        // e depois as informações que o programa vai exibir para o usuario
        // o que se pede no prormagra que devo fazer e estabelececer primeiro as informações que vou pegar do usurio 
        // e depois as informações que o programa vai exibir para o usuario
        // o que se pede no prormagra que devo fazer e estabelececer primeiro as informações que vou pegar do usurio 
        // e depois as informações que o programa vai exibir para o usuario

//1 // o que se pede no prormagra que devo fazer e estabelececer primeiro as informações que vou pegar do usurio 
        

//  aqui lemrando que devo colocar o tipo smepre antes 
// no caso de mesnassem de boas vindos posso melhoraar o codigo e colocar e mudar a ordem dos codigos 

        // titulo do programa
        System.out.println("Bem-vindo ao sistema de cinema!");
// declaração de variáveis
        String nome;
        int idade,opcao;

        // mensagem de boas vindas
        System.out.println("Por favor, informe seu nome e idade.");
       



// entrada de dados
        System.out.print("Nome: ");
        nome = leia.nextLine();
        System.out.print("Idade: ");
        idade = leia.nextInt();

        // filmes disponíveis
String[] filmes = {
            "1. Vingadores: Ultimato (12 anos)",
            "2. O Rei Leão (10 anos)",
            "3. Coringa (16 anos)",
            "4. Frozen II (Livre)",
            "5. It: A Coisa (18 anos)"
        };

        // exibe os filmes disponíveis
        System.out.println("Escolha um filme:");
        for (String filme : filmes) {
            System.out.println(filme);
        }

        // entrada da opção do usuário
        System.out.print("Digite o número do filme que deseja assistir: ");
        opcao = leia.nextInt();

        // verifica se a idade é suficiente para o filme escolhido
        if ((opcao == 1 && idade >= 12) || 
            (opcao == 2 && idade >= 10) || 
            (opcao == 3 && idade >= 16) || 
            (opcao == 4) || 
            (opcao == 5 && idade >= 18)) {
            
            System.out.println("Ingresso comprado com sucesso! Aproveite o filme, " + nome + "!");
        } else {
            System.out.println("Desculpe, " + nome + ". Você não tem idade suficiente para assistir a este filme.");
        }

// saída de dados
       System.out.println("Obrigado por utilizar nosso sistema de cinema!");

//input - entrada de dados


// output


// fecha objeto LEIA:
        leia.close();




         
    }
}
