package com.atividade.model;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private Pessoa proprietario;

    public Veiculo(String marca, String modelo, String placa, Pessoa proprietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.proprietario = proprietario;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }


}
