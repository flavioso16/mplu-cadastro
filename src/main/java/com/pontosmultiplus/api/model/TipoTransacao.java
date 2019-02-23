package com.pontosmultiplus.api.model;

public enum TipoTransacao {
	ACUMULO("A"), RESGATE("R");

	String tipo;

	TipoTransacao(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}
}
