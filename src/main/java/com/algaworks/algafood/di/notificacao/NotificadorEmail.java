package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component
@TipoDeUrgencia(NivelUrgencia.Normal)
public class NotificadorEmail implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Olá %s, email: %s, estamos te enviando essa mensagem para informar que %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
