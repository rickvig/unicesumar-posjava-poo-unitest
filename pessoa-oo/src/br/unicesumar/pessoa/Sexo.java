package br.unicesumar.pessoa;

public enum Sexo {

	M("Masculino"), 
	F("Feminino");

	String valor;

	private Sexo(String valor) {
		this.valor = valor;
	}

	public static String get(String sexo) {
		for (Sexo s : values())
			if (s.name().equals(sexo))
				return s.valor;

		return "";
	}

}
