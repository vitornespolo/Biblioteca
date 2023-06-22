package com.projetopessoal.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
//@Table(name = "livro")
public class Livro {

    private String titulo;
    private int numeroDePaginas;
    private Boolean lido;
    private float nota;
    private Boolean ativo;
}
