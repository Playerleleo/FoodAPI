package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component
@TipoDeUrgencia(NivelUrgencia.Urgente)
public class NotificadorSMS implements Notificador {
	public String servidorEmail;
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Olá %s, telefone: %s, estamos te enviando essa mensagem para informar que %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
}
