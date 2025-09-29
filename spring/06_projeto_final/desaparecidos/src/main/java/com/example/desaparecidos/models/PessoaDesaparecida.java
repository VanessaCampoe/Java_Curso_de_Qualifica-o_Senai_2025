
// 1 Definir o package da classe
// 1.1 Pular umas linhas do import
// 2 Declarar os ATRIBUTOS da classe (lembra maluca nao é uma pessoa caralho)
// 3 Declarar a CLASSE e as ANOTAÇÕES 
// 4 Criar o construtor vazio 
// 5 Criar os GETTERS e SETTERS (métodos para acessar e alterar os atributos)
// 6 Os IMPORTS aparecem automaticamente conforme  as anotações
// Devo verificar os imports no final .

//+++++++++++>>>>>>>>>> suas entidades (PessoaDesaparecida)



package com.example.desaparecidos.models;

import jakarta.persistence.*;

@Entity
public class PessoaDesaparecida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;
    private String sexo;
    private String dataDesaparecimento;
    private String localDesaparecimento;
    private String caracteristicas;
    private String contatoResponsavel;
    private String observacoes;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getDataDesaparecimento() { return dataDesaparecimento; }
    public void setDataDesaparecimento(String dataDesaparecimento) { this.dataDesaparecimento = dataDesaparecimento; }

    public String getLocalDesaparecimento() { return localDesaparecimento; }
    public void setLocalDesaparecimento(String localDesaparecimento) { this.localDesaparecimento = localDesaparecimento; }

    public String getCaracteristicas() { return caracteristicas; }
    public void setCaracteristicas(String caracteristicas) { this.caracteristicas = caracteristicas; }

    public String getContatoResponsavel() { return contatoResponsavel; }
    public void setContatoResponsavel(String contatoResponsavel) { this.contatoResponsavel = contatoResponsavel; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
}
