package com.projetopessoal.demo.impl.repository;

import com.projetopessoal.demo.model.Livro;
import com.projetopessoal.demo.model.Pessoa;

import java.util.List;

public class PessoaQueryRepositoryImpl {
    public List<Pessoa> buscarPessoa() {
        String buscarPessoa = """
                select * from pessoa
                """;
        return null;
    }
}
