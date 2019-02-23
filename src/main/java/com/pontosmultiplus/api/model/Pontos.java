package com.pontosmultiplus.api.model;

import java.time.LocalDate;

public class Pontos {

	private Long id;
	private Parceiro parceiro;
	private LocalDate dataAcumulo;
	private LocalDate dataExpiracao;
	private Long quantidade;
	private TipoTransacao tipoTransacao;

	public Pontos(Parceiro parceiro, LocalDate dataAcumulo, LocalDate dataExpiracao, Long quantidade,
			TipoTransacao tipoTransacao) {
		super();
		this.parceiro = parceiro;
		this.dataAcumulo = dataAcumulo;
		this.dataExpiracao = dataExpiracao;
		this.quantidade = quantidade;
		this.tipoTransacao = tipoTransacao;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public Parceiro getParceiro() {
		return parceiro;
	}

	public LocalDate getDataAcumulo() {
		return dataAcumulo;
	}

	public LocalDate getDataExpiracao() {
		return dataExpiracao;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public TipoTransacao getTipoTransacao() {
		return tipoTransacao;
	}

}
