package com.example.projetotestesjunit5.infrastructure.entity;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {

    private String nome;
    private String cpf;
    private String profissao;
    private Integer idade;
    private String cidade;
    private String rua;
    private Integer numero;

    public Pessoa(String joão, String cpf) {
    }
}
