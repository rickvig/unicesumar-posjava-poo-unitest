package com.br.unicesumar;

public class Administrador extends Professor {

	private Departamento departamento;

	public Administrador(Departamento departamento) {
		this.departamento = departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	public Double calculaAdicionais(Double montante) {
		Double adicionalDoDepartamento = montante * (0.05 * this.departamento.getQuantidadeDeCursos());
		
		Double montanteComTitulos = super.calculaAdicionais(montante);
		
		return montanteComTitulos + adicionalDoDepartamento;
	}

}
