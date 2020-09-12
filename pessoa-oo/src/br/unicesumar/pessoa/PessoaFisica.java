package br.unicesumar.pessoa;

import java.util.List;

import br.unicesumar.util.Util;

public class PessoaFisica extends Pessoa {
	
	private int idade;
	private Sexo sexo;
	
	public PessoaFisica(String nome, int idade, Sexo sexo, CPF cpf, List<Telefone> telefone) {
		super(nome, telefone);
		setDocumento(cpf);
		this.idade = idade;
		this.sexo = sexo;
	}

	public int somaIdade(int anos) {
		return idade + anos;
	}
	
	public void fala() {
		System.out.println("Eu falo, sou: " + getNome());
	}
	
	public void ouve() {
		System.out.println("Estou ouvindo...");
	}

	public String getSexo() {
		return sexo.valor;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Pessoa: [ "
				+ "\nnome=" + getNome() + ", "
				+ "\nidade=" + idade + ", "
				+ "\nsexo=" + sexo + ", "
				+ "\nidentidade=" + getDocumento()+ ", "
				+ "\ntelefone=" + getTelefones() + ", "
				+ "\nendereco=" + getEndereco() + "\n]";
	}
	
	@Override
	public String getDocumentoFormatado() {
		return getDocumento().getNumeroFormatado();
	}

}
