package com.projetopessoal.demo.impl.service;

import com.projetopessoal.demo.impl.repository.LivroRepository;
import com.projetopessoal.demo.model.Livro;
import lombok.NonNull;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroQueryServiceImpl {

    @Autowired
    private @NonNull
    LivroRepository livroRepository;

    public Livro buscarPeloId(Long id) {
        return livroRepository.buscarLivroPorId(id);
    }

    public List<Livro> buscarLivros() {
        return livroRepository.findAll();
    }

    public Livro cadastrarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public Livro update(Long id, Livro livro) {
        Livro livroSalvo = livroRepository.buscarLivroPorId(id);

        BeanUtils.copyProperties(livro, livroSalvo, "id");
        return livroRepository.save(livroSalvo);

    }

    public void delete(Long id) {
        livroRepository.deleteById(id);
    }
}
