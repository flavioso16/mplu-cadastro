package com.pontosmultiplus.api.model;

public enum StatusDominio {
	ATIVO("A"), INATIVO("I");

	String status;

	StatusDominio(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}
}
