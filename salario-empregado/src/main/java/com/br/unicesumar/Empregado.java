package com.br.unicesumar;

public abstract class Empregado implements SalarioI {
	
	public static final Double FIXO_FALTA = 50D;
	
	private int anosDeTrabalho = 1;
	private int quantidadeDeFaltas;
	
	public Double getSalario() {
		Double montante = getSalarioBase();
		
		if (this.getAnosDeTrabalho() > 1) {
			Double valor = getSalarioBase() * getPorcentagemAnual();
			montante += valor * this.getAnosDeTrabalho();
		}
		
		montante = calculaAdicionais(montante);
		
		if (this.getQuantidadeDeFaltas() > 0) {
			montante -= FIXO_FALTA + ((getPorcentagemFalta() * montante) * this.getQuantidadeDeFaltas());
		}
		
		return montante;	
	}

	protected abstract Double getPorcentagemFalta();

	protected abstract Double getPorcentagemAnual();

	protected abstract Double getSalarioBase();

	public void setAnoDeTrabalho(int anosDeTrabalho) {
		this.anosDeTrabalho = anosDeTrabalho;
	}
	
	public int getAnosDeTrabalho() {
		return anosDeTrabalho;
	}
	
	public void setQuantidadeDeFaltas(int quantidadeDeFaltas) {
		this.quantidadeDeFaltas = quantidadeDeFaltas;
	}
	
	public int getQuantidadeDeFaltas() {
		return this.quantidadeDeFaltas;
	}
}
