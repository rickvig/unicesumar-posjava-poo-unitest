package br.unicesumar.pessoa;

import br.unicesumar.util.Util;

public class CNPJ implements Documento {
	
	String cnpj;
	
	public CNPJ(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String getNumero() {
		return cnpj;
	}

	@Override
	public String getNumeroFormatado() {
		return Util.formatString(this.cnpj, "##.###.###/####-##");
	}
	
	// https://www.devmedia.com.br/validando-o-cnpj-em-uma-aplicacao-java/22374

}
