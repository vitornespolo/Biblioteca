package com.projetopessoal.demo.impl.service;

import com.projetopessoal.demo.impl.repository.LivroQueryRepository;
import com.projetopessoal.demo.impl.repository.LivroQueryRepositoryImpl;
import com.projetopessoal.demo.model.Livro;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroQueryServiceImpl {

//    private @NonNull
//    LivroQueryRepositoryImpl livroQueryRepository;

    private @NonNull
    LivroQueryRepository livroQueryRepository;

    public List<Livro> buscarLivros() {
        return livroQueryRepository.findAll();
    }

    public Livro cadastrarLivro(Livro livro) {
        return livroQueryRepository.save(livro);
    }

    public Livro update(Long id, Livro livro) {
        return null;
    }

    public Livro delete(Long id) {
        return null;
    }
}
