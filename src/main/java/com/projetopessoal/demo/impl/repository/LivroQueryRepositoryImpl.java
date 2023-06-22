package com.projetopessoal.demo.impl.repository;

import com.projetopessoal.demo.model.Livro;
import org.springframework.stereotype.Service;

import java.util.List;

public class LivroQueryRepositoryImpl {
    public List<Livro> buscarLivros() {
        String buscarLivros = """
                select * from livros
                """;
        return null;
    }
}
