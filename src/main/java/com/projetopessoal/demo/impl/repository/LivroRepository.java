package com.projetopessoal.demo.impl.repository;

import com.projetopessoal.demo.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    @Query("from Livro l where l.id = :id")
    Livro buscarLivroPorId(Long id);
}
