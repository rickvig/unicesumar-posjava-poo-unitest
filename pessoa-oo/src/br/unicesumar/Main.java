package br.unicesumar;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;

import br.unicesumar.pessoa.CNPJ;
import br.unicesumar.pessoa.CPF;
import br.unicesumar.pessoa.Pessoa;
import br.unicesumar.pessoa.PessoaFisica;
import br.unicesumar.pessoa.PessoaJuridica;
import br.unicesumar.pessoa.Sexo;
import br.unicesumar.pessoa.Telefone;

public class Main {

	public static void main(String[] args) {

//		basico();

		polimorfico();
	}

	private static void polimorfico() {
		Pessoa henrique = new PessoaFisica(
				"Henrique", 30, Sexo.M, 
				new CPF("07082485948"),
				asList(new Telefone("44999410923")));

		Pessoa lorena = new PessoaFisica(
				"Henrique", 6, Sexo.M, 
				new CPF("83813870006"),
				asList(new Telefone("44999410923")));
		
		Pessoa mentors = new PessoaJuridica(
				"Mentors ltda.", 
				new CNPJ("17762031000182"),
				asList(new Telefone("44999410923")));

		List<Pessoa> pessoas = Arrays.asList(henrique, lorena, mentors);

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getDocumentoFormatado());
		}
	}

	private static void basico() {
		Pessoa henrique = new PessoaFisica("Henrique", 28, Sexo.M, new CPF("07082485948"), asList(new Telefone("44999410923")));

		System.out.println(henrique);

		System.out.println(henrique.souDoTipo());
		System.out.println(henrique.getDocumento());
		System.out.println(henrique.getDocumentoFormatado());

		henrique = new PessoaJuridica("Henrique ltda.", new CNPJ("17762031000182"),
				asList(new Telefone("44999410923")));

		System.out.println(henrique.souDoTipo());
		System.out.println(henrique.getDocumentoFormatado());
	}

}
