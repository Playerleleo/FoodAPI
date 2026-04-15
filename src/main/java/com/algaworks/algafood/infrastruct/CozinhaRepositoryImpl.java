package com.algaworks.algafood.infrastruct;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CozinhaRepositoryImpl implements CozinhaRepository {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cozinha> listar() {
        return manager.createQuery("from cozinha", Cozinha.class).getResultList();
    }

    @Override
    public Cozinha buscarID(Long id) {
        return manager.find(Cozinha.class, id);
    }

    @Transactional
    @Override
    public Cozinha salvar(Cozinha cozinha) {
        return manager.merge(cozinha);
    }


    @Transactional
    @Override
    public void remover(Cozinha cozinha) {
        cozinha = buscarID(cozinha.getId());
        manager.remove(cozinha);
    }
}
