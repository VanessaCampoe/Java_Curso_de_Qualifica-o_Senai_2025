
package com.correcaocinema.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);
// variaveis 

String nome , sala;
int idade , idadeMinima = 0;


//

System.out.println("Inform o nome :");
nome = leia.nextLine();
System.out.println("Informe a idade:");
idade = leia.nextInt();


// limpezza de buffer 
leia.nextLine();


do {
    // salas
    System.out.println("Cine Java\n");

    System.out.println("Sala 1 - A Roda quadrada - livre");
    System.out.println("Sala 2 - A volta dos que nao foram - 12 anos");
    System.out.println("Sala 3 - As traças do rei careca  - 14 anos");
    System.out.println("Sala 4 - Poeira em Alta mar - 16 anos ");
    System.out.println("Sala 5 - A vigança do frango assado - 18 anos ");
    System.out.println("Sala Qual sala deseja entrar?");
    sala = leia.nextLine();


    switch (sala) {
        case "1":
            
            break;
        case "2":
            idadeMinima = 12;
            break;
        case "3":
            idadeMinima = 14;
            break;
        case "4":
            idadeMinima = 16;
            break;
        case "5":
            idadeMinima = 18;
            break;
             System.out.println("Sala inexistente.");
    
        default:
        idadeMinima = idade + 1;
        System.out.println("Sala inexistente" );
    if (idade >= idadeMinima) {
        System.out.println("Entrada permitida");
        System.out.println("Tenha um bom filme!");
    }
    System.out.println("Favor escolher outr filme ");
    }
// todo

// ternario diminui o porcessamento


// faça enquanto ate que chegue na idade minima q é 0 por isso tem esse aqui 
}while (idade < idadeMinima);


leia.close();












}

    }
}
