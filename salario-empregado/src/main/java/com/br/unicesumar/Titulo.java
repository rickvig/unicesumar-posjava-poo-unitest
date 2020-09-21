package com.br.unicesumar;

public enum Titulo {
	
	PADRAO(0D),
	DOUTORA(0.07), 
	MESTRADO(0.05);
	
	private Double valor;

	Titulo(Double valor) {
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}


}
