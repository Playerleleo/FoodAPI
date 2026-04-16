package com.algaworks.algafood.domain.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String nome;
    private BigDecimal taxaFrete;
    @ManyToOne
    private Cozinha cozinha;
}
