package com.algaworks.algafood.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Permissao {
    @Id
    @EqualsAndHashCode.Include
    private Long id;
    @Column(nullable = false)
    private String descricao;
}
