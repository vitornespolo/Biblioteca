package com.projetopessoal.demo.impl.repository;

import com.projetopessoal.demo.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroQueryRepository extends JpaRepository<Livro, Long> {
}
