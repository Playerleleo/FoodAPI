package com.algaworks.algafood.infrastruct;

import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class RestauranteRepositoryImpl implements RestauranteRepository {

    @PersistenceContext
    private EntityManager manager;

    public List<Restaurante> Listar() {
        return manager.createQuery("From restaurante", Restaurante.class).getResultList();
    }

    @Transactional
    @Override
    public Restaurante salvar(Restaurante restaurante) {
        return manager.merge(restaurante);
    }

    @Override
    public Restaurante buscarID(Long id) {
        return manager.find(Restaurante.class, id);
    }

    @Transactional
    @Override
    public void remover(Restaurante restaurante) {
        restaurante = buscarID(restaurante.getId());
        manager.remove(restaurante);
    }
}
