package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.ClienteEvent;


@Service
public class AtivacaoClienteService {
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void ativarCliente (Cliente cliente) {
		cliente.ativar();
        applicationEventPublisher.publishEvent(new ClienteEvent(cliente));
	}
}
	
