package br.unicesumar.pessoa;

import static java.lang.Integer.parseInt;

public class Telefone {

	private Integer ddd;
	private Integer digito;
	private Integer numero;

	public Telefone() {
		throw new RuntimeException("Não use este construtor");
	}
	
	public Telefone(String telefone) {
		telefone = telefone.replaceAll(" ", "")
				.replaceAll("\\(", "")
				.replaceAll("\\)", "")
				.replaceAll("-", "");

		isValido(telefone);
		ddd = parseInt(telefone.substring(0, 2));
		digito = parseInt(telefone.substring(2, 3));
		numero = parseInt(telefone.substring(3, 11));
	}

	@Override
	public String toString() {
		return "Telefone [ddd=" + ddd + ", digito=" + digito + ", numero=" + numero + "]";
	}

	public boolean isValido(String tel) {
		String regex = "^[1-9]{2}?9([0-9]{8})$";

		boolean matches = tel.matches(regex);			
		
		if (!matches) 
			throw new RuntimeException("Telefone inválido!");
		
		return matches;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getDigto() {
		return getDigto();
	}

	public void setDigto(int digto) {
		this.digito = digto;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
