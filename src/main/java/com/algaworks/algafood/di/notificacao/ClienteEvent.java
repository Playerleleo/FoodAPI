package com.algaworks.algafood.di.notificacao;

import org.springframework.context.ApplicationEvent;

import com.algaworks.algafood.di.modelo.Cliente;

public class ClienteEvent {
	
	private Cliente cliente;

	public ClienteEvent(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
}
