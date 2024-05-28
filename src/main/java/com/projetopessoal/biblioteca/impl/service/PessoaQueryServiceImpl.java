package com.projetopessoal.biblioteca.impl.service;

import com.projetopessoal.biblioteca.impl.repository.PessoaRepository;
import com.projetopessoal.biblioteca.model.Pessoa;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class PessoaQueryServiceImpl {

    @NonNull
    private PessoaRepository pessoaRepository;

    public List<Pessoa> buscarPessoa() {

        return pessoaRepository.findAll();
    }

    public Pessoa buscarPeloId(Long id) {

        return pessoaRepository.buscarPessoaPorId(id);
    }

    public Pessoa criarPessoa(Pessoa pessoa) {
       return pessoaRepository.save(pessoa);
    }

    public Pessoa atualizar(Long id, Pessoa pessoa) {

        Pessoa pessoaSalvo = pessoaRepository.buscarPessoaPorId(id);

        BeanUtils.copyProperties(pessoa, pessoaSalvo, "id");
        return pessoaRepository.save(pessoaSalvo);
    }

    public void delete(Long id) {

        pessoaRepository.deleteById(id);
    }
}
