package com.algaworks.algafood.controller;

import com.algaworks.algafood.domain.model.FormaPagamento;
import com.algaworks.algafood.domain.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/FormaPagamentos")
@RestController
public class FormaPagamentoController {

    @Autowired
    FormaPagamentoRepository formaPagamentoRepository;

    @GetMapping
    List<FormaPagamento> listar() {
        return formaPagamentoRepository.listar();
    }

    @PostMapping
    FormaPagamento salvar(@RequestBody FormaPagamento formaPagamento) {
        return formaPagamentoRepository.salvar(formaPagamento);
    }

}
