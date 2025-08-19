package com.composicao.model;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private String telfone;
    private String endereco;


    public Pessoa(String nome, String cpf, String email, String telfone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telfone = telfone;
        this.endereco = endereco;
    }



    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelfone() {
        return this.telfone;
    }

    public void setTelfone(String telfone) {
        this.telfone = telfone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    }
