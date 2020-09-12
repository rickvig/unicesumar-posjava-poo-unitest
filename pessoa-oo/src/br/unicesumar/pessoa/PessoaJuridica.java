package br.unicesumar.pessoa;

import java.util.List;

import br.unicesumar.util.Util;

public class PessoaJuridica extends Pessoa {
	
	String nomeFantasia;

	public PessoaJuridica(String nome, CNPJ documento, List<Telefone> telefone) {
		super(nome, telefone);
		setDocumento(documento);
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String string) {
		this.nomeFantasia = string;
	}

	@Override
	public String getDocumentoFormatado() {
		return getDocumento().getNumeroFormatado();
	}
}
