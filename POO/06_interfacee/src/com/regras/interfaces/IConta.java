package com.regras.interfaces;

public interface IConta {
    // funciona de forma parecida com uma classe abstrata
    //  nome visibilidade e retorno
    //  nome dos metos e so sem disser o que eles vao fazzer 
    // exibir dados saque e deposito 
    //  primeiro metodo  sem chave e com ponto e virgula 
     public void exibirDados();
     public double fazerDeposito(double valor);
     public double fazerSaque(double valor);
}
