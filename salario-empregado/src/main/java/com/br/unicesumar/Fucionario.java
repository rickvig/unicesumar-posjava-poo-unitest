package com.br.unicesumar;

public class Fucionario extends Empregado {

	private static final Double SALARIO_BASE = 2000D;

	@Override
	protected Double getSalarioBase() {
		return SALARIO_BASE;
	}

	@Override
	protected Double getPorcentagemAnual() {
		return 0.08;
	}

	@Override
	protected Double getPorcentagemFalta() {
		return 0.02;
	}

	public Double calculaAdicionais(Double montante) {
		return montante;
	}

}
