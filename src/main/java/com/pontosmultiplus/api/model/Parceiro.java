package com.pontosmultiplus.api.model;

import java.util.List;

public class Parceiro {

	private Long id;
	private Usuario contato;
	private List<Dominio> dominios;
	private String nome;
	private String cnpj;

	public Parceiro(Usuario contato, List<Dominio> dominios, String nome, String cnpj) {
		super();
		this.contato = contato;
		this.dominios = dominios;
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public Usuario getContato() {
		return contato;
	}

	public List<Dominio> getDominios() {
		return dominios;
	}

	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}

}
