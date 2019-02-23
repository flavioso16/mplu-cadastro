package com.pontosmultiplus.api.model;

public class Dominio {

	private Long id;
	private String dominio;
	private StatusDominio status;

	public Dominio(String dominio, StatusDominio status) {
		super();
		this.dominio = dominio;
		this.status = status;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getDominio() {
		return dominio;
	}

	public StatusDominio getStatus() {
		return status;
	}

}
