package com.algaworks.algafood.jpa;

import com.algaworks.algafood.domain.model.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class CadastraCozinha {

    @PersistenceContext
    private EntityManager manager;

    public List<Cozinha> listar() {
       return manager.createQuery("from cozinha", Cozinha.class).getResultList();
    }

    @Transactional
    public Cozinha cadastro(Cozinha cozinha) {
       return manager.merge(cozinha);
    }

    public Cozinha buscarID(Long id) {
        return manager.find(Cozinha.class, id);
    }
}
