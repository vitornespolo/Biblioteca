package com.projetopessoal.demo.impl.service;

import com.projetopessoal.demo.impl.repository.LivroRepository;
import com.projetopessoal.demo.model.Livro;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
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
