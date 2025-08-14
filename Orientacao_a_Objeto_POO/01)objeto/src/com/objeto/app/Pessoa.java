package com.objeto.app;

public class Pessoa {
    // atributo  
    // modificador de acesso 
    // tipo de atributo 
    // atributo seguido de ;
 //atributo
    public String nome; // atributo de um objeto 
    public int idade;
    public double altura;


    public Pessoa() {  // paa fazer o construtor vazio eu preciso fazer  code geeneret for java  depois // generato empyt construtor  
    }


    // construtor  /// ele faz uma referencia aos atributos da classe e ele so faz referencia se atibutos refente ao construtor /// prefeiri far esse para pq mantem a integridade dos dados//  botao direito co de  generate for java  all fields 

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

public String cumprimentar(){ // aqui o string e obrigatorio 
    return "Olá, meu nome é " + nome + ", tenho " + idade + " anos e minha altura é " + altura + " metros.";
}

    // metdodo
    public void exibirDados() { // camel case parametro de variavel
        // System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e minha altura é " + altura + " metros.");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }

}
