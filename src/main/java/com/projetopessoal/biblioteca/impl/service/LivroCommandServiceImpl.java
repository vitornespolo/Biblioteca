package com.projetopessoal.biblioteca.impl.service;

import com.projetopessoal.biblioteca.impl.repository.LivroRepository;
import com.projetopessoal.biblioteca.model.Livro;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class LivroCommandServiceImpl {

    private final @NonNull
    LivroRepository livroRepository;

    private final @NonNull
    LivroQueryServiceImpl livroQueryService;


    public Livro cadastrarLivro(Livro livro) throws Exception {

        if (livroQueryService.existLivro(livro.getTitulo())) {

            throw new Exception("Já existe esse livro na base");
        }

        return livroRepository.save(livro);
    }
}
