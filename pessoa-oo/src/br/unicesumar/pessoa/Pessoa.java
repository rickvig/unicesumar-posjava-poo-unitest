package br.unicesumar.pessoa;

import java.util.List;

import br.unicesumar.endereco.Endereco;

public abstract class Pessoa {
	
	private String nome;
	private Documento documento;
	private List<Telefone> telefones;	
	private Endereco endereco;
	private int idade;
	
	public Pessoa(String nome, List<Telefone> telefone) {
		this.nome = nome;
		this.telefones = telefone;
	}
	
	public String souDoTipo() {
		return this.getClass().toString();
	};

	public abstract String getDocumentoFormatado();

	public boolean temTelefone() {
		return !telefones.isEmpty();
	}

	public int temQuantosTelefones() {
		return telefones.size();
	}

	public boolean temEndereco() {
		return endereco != null ? true : false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Documento getDocumento() {
		return documento;
	}
	
	public void setDocumento(Documento identidade) {
		this.documento = identidade;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
