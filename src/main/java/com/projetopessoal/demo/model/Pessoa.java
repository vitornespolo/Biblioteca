package com.projetopessoal.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
//@Table(name = "pessoa")
public class Pessoa {

    private String nome;
    private String sobrenome;
    private Boolean ativo;
}
