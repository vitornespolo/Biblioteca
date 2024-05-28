package com.projetopessoal.biblioteca.impl.service;

import com.projetopessoal.biblioteca.impl.repository.LivroRepository;
import com.projetopessoal.biblioteca.model.Livro;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class LivroQueryServiceImpl {

    private @NonNull
    LivroRepository livroRepository;

    public List<Livro> buscarLivros() {

        return livroRepository.findAll();
    }

    public Livro buscarPeloId(Long id) {

        return livroRepository.buscarLivroPorId(id);
    }

    public Livro update(Long id, Livro livro) {

        Livro livroSalvo = livroRepository.buscarLivroPorId(id);

        BeanUtils.copyProperties(livro, livroSalvo, "id");
        return livroRepository.save(livroSalvo);

    }

    public void delete(Long id) {

        livroRepository.deleteById(id);
    }

    public boolean existLivro(String titulo) {

        return livroRepository.existLivro(titulo) == 0 ? Boolean.FALSE : Boolean.TRUE;
    }
}
