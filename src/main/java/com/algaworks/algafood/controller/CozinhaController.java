package com.algaworks.algafood.controller;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {

    @Autowired
    private CozinhaRepository cozinhaRepository;

    @GetMapping
    List<Cozinha> listar() {
        return cozinhaRepository.listar();
    }

    @PostMapping
    Cozinha salvar (@RequestBody Cozinha cozinha) {
        return cozinhaRepository.salvar(cozinha);
    }
}
