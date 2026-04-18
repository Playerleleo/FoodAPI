package com.algaworks.algafood.domain.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormaPagamento {
    @Id
    private Long id;
    private String descricao;
}
