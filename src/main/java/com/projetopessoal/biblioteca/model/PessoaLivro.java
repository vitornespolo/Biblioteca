package com.projetopessoal.biblioteca.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pessoa_livro")
public class PessoaLivro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "idPessoa", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne
    private Pessoa pessoa;

    @JoinColumn(name = "idLivro", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne
    private Livro livro;

    private String nota;

    private int paginasLidas;

    private Boolean lido;

    private Boolean ativo;

}
