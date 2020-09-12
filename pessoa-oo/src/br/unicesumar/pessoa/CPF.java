package br.unicesumar.pessoa;

import br.unicesumar.util.Util;

public class CPF implements Documento {

	private String numero;
	
	public CPF(String numero) {
		this.numero = numero;
	}

	@Override
	public String getNumero() {
		return numero;
	}

	@Override
	public String getNumeroFormatado() {
		return Util.formatString(this.numero, "###.###.###-##");
	}
	
	// https://www.devmedia.com.br/validando-o-cpf-em-uma-aplicacao-java/22097
	// https://github.com/raphaeloneves/validador-cpf-annotation/blob/master/src/main/java/br/com/raphaelneves/cpf/validator/CpfValidator.java

}
