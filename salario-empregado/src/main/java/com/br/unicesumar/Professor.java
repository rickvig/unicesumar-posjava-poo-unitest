package com.br.unicesumar;

public class Professor extends Empregado {
	
	private static final Double SALARIO_BASE = 3000D;
	private Titulo titulo = Titulo.PADRAO;


	public Double calculaAdicionais(Double montante) {
		montante += montante * this.titulo.getValor();
		return montante;
	}

	@Override
	protected Double getPorcentagemFalta() {
		return 0.03;
	}

	@Override
	protected Double getPorcentagemAnual() {
		// TODO Auto-generated method stub
		return 0.12;
	}

	@Override
	protected Double getSalarioBase() {
		return SALARIO_BASE;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}

}
