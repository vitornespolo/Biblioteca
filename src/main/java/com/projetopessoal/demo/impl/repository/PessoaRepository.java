package com.projetopessoal.demo.impl.repository;

import com.projetopessoal.demo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

    @Query("from Pessoa p where p.id = :id")
    Pessoa buscarPessoaPorId(Long id);
}
