
// 1 Definir o package da classe
// 1.1 Pular umas linhas do import
// 2 Declarar os ATRIBUTOS da classe (lembra maluca nao é uma pessoa caralho)
// 3 Declarar a CLASSE e as ANOTAÇÕES 
// 4 Criar o construtor vazio 
// 5 Criar os GETTERS e SETTERS (métodos para acessar e alterar os atributos)
// 6 Os IMPORTS aparecem automaticamente conforme  as anotações
// Devo verificar os imports no final .


package com.example.desaparecidos.models;



private Long id;
private String nome;
private Integer idade;
private String sexo;
private java.time.LocalDate dataDesaparecimento;
private String localDesaparecimento;
private String caracteristicas;
private String contatoResponsavel;
private String observacoes;


@Entity
public class Pessoa implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private Integer idade;
    private String sexo;
    private java.time.LocalDate dataDesaparecimento;
    private String localDesaparecimento;
    private String caracteristicas;
    private String contatoResponsavel;
    private String observacoes;


    public PessoaDesaparecida() {}

   
}



import java.io.Serializable;



}
