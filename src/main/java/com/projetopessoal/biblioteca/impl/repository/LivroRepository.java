package com.projetopessoal.biblioteca.impl.repository;

import com.projetopessoal.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    @Query("from Livro l where l.id = :id")
    Livro buscarLivroPorId(Long id);

    @Query("SELECT COUNT(l.id) from Livro l where l.titulo = :titulo")
    Long existLivro(String titulo);
}
