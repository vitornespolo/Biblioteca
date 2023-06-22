package com.projetopessoal.demo.impl.service;

import com.projetopessoal.demo.impl.repository.PessoaQueryRepositoryImpl;
import com.projetopessoal.demo.model.Pessoa;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaQueryServiceImpl {

    private @NonNull
    PessoaQueryRepositoryImpl pessoaQueryRepository;

    public List<Pessoa> buscarPessoa() {
        return pessoaQueryRepository.buscarPessoa();
    }
}
