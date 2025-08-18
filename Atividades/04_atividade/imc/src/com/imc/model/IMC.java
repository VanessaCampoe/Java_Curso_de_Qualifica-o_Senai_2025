package com.imc.model;

public class IMC {
    private double peso;
    private double altura;


    // construtor  bota direito e generete  depois procurar o construtor
    public IMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // getters e setters cricar com o botao direito generete e criar get e setter 

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

// criando meus metodos , nao a necessidade de passar os parametos para o metatodo , sem o this ele precisa do parametro 

public double calcularIMC() {
    return this.peso / (this.altura * this.altura);

    //  agora sim vou colocar o parametro do tipo double imc e meu paramentro 

}

    public String diagnostico(double imc) {
        return               (imc <= 18.5) ? "Abaixo do peso" :
               (imc <= 25) ? "Peso normal" :
               (imc <= 30) ? "Você está acima do peso" :
               (imc <= 35) ? "Obesidade grau 1" :
               (imc <= 40) ? "Obesidade grau 2" : "Obesidade grau 3";
    }

} 



// criar com dois metodos um retorn para o imc e um para o diagnostico

// criar a class dentro de model . new java file e class