package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.model.FormaPagamento;

import java.util.List;

public interface CidadeRepository {
    List<Cidade> listar();
    Cidade BuscarID(Long id);
    Cidade salvar(Cidade cidade);
    void remover(Cidade cidade);
}
