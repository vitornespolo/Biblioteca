package com.projetopessoal.demo.impl.repository;

import com.projetopessoal.demo.model.Livro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LivroQueryRepositoy {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Livro> custonQuery(Long id) {
        String query = "from Livro l where l.id = :id";
        TypedQuery<Livro> typedQuery = entityManager.createQuery(query, Livro.class);
        typedQuery.setParameter("id", id);

        return typedQuery.getResultList();
    }
}
