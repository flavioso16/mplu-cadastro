package com.pontosmultiplus.api.model;

public enum Genero {
	MASCULINO("M"), FEMININO("F");

	String nome;

	Genero(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

}
