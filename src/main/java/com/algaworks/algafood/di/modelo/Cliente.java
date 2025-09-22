package com.algaworks.algafood.di.modelo;

public class Cliente {
	
	private String nome;
	private String email;
	private String telefone;
	private boolean ativo = false;
	
	public Cliente (String name, String email, String telefone) {
		this.nome = name;
		this.email = email;
		this.telefone = telefone;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public Boolean isAtivo() {
		return ativo;
	}
	
	public Boolean ativar() {
		return this.ativo = true;
	}
	
}

