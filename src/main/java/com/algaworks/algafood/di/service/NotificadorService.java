package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.algaworks.algafood.di.notificacao.ClienteEvent;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDeUrgencia;

@Service
public class NotificadorService {
	
	@Autowired(required = false)
	@TipoDeUrgencia(NivelUrgencia.Normal)
	private Notificador notificador;
	
	
	@EventListener
	public void notificadorListener(ClienteEvent clienteEvent) {
		String  mensagem = geraMesagem();
		notificador.notificar(clienteEvent.getCliente(), mensagem);
	}
	
	public String geraMesagem() {
	  String mensagem = (notificador != null) 
				? "Seu usuário está ativo no nosso sistema" 
				: "notificador está null";
	  return mensagem;
	}
}
