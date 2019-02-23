package com.pontosmultiplus.api.model;

import java.time.LocalDate;
import java.util.List;

public class Usuario {

	private Long id;
	private String primeiroNome;
	private String sobrenome;
	private String cpf;
	private String email;
	private LocalDate dataNascimento;
	private Genero genero;
	private List<Pontos> pontos;

	public Usuario(String primeiroNome, String sobrenome, String cpf, String email, LocalDate dataNascimento,
			Genero genero, List<Pontos> pontos) {
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.pontos = pontos;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public List<Pontos> getPontos() {
		return pontos;
	}

}
