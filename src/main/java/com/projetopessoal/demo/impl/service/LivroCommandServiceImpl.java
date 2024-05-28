package com.projetopessoal.demo.impl.service;

import com.projetopessoal.demo.impl.repository.LivroRepository;
import com.projetopessoal.demo.model.Livro;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LivroCommandServiceImpl {

    private @NonNull
    LivroRepository livroRepository;

    @NonNull
    private
    LivroQueryServiceImpl livroQueryService;


    public Livro cadastrarLivro(Livro livro) {

        boolean existLivro = livroQueryService.existLivro(livro.getTitulo());

        if (!existLivro) {

            return livroRepository.save(livro);
        }

        return null;
    }
}
