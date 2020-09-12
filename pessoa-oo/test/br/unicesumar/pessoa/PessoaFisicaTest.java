package br.unicesumar.pessoa;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.unicesumar.endereco.Endereco;
import br.unicesumar.pessoa.CPF;
import br.unicesumar.pessoa.PessoaFisica;
import br.unicesumar.pessoa.Sexo;

public class PessoaFisicaTest {
	
	private PessoaFisica subject;

	@Before
	public void setup() {
		Telefone telefone = new Telefone("44999410923");
		CPF cpf = new CPF("07082485948");
		
		subject = new PessoaFisica("Henrique", 28, Sexo.M, cpf, asList(telefone));
	}

	@Test
	public void testSouDoTipo() {
		assertEquals(PessoaFisica.class, subject.souDoTipo());
	}
	
	@Test
	public void testConstrutor() {
		assertNotNull(subject);
	}

	@Test
	public void testSomaIdade() {
		int novaIdade = subject.somaIdade(30);
		assertEquals(58, novaIdade);
	}
	
	@Test
	public void testPessoaFala() {
		PessoaFisica pessoa = Mockito.mock(PessoaFisica.class);
		pessoa.fala();
		Mockito.verify(pessoa).fala();
	}
	
	@Test
	public void testPessoaOuve() {
		PessoaFisica pessoa = Mockito.mock(PessoaFisica.class);
		pessoa.ouve();
		Mockito.verify(pessoa).ouve();
	}
	
	@Test
	public void testPessoaTemTelefones() {
		assertTrue(subject.temTelefone());
	}
	
	@Test
	public void testPessoaTemQuantosTelefones() {
		assertEquals(1, subject.temQuantosTelefones());
	}
	
	@Test
	public void testPessoaTemEndereco() {
		subject.setEndereco(new Endereco());
		assertTrue(subject.temEndereco());
	}
	
	@Test
	public void testRetornaSexoLegivelMaculino() {
		assertEquals("Masculino", subject.getSexo());
	}
	
	@Test
	public void testRetornaSexoLegivelFeminino() {
		subject.setSexo(Sexo.F);
		assertEquals("Feminino", subject.getSexo());
	}
	
	@Test
	public void testRetornaCPFFormatado() {
		assertEquals("070.824.859-48", subject.getDocumentoFormatado());
	}
	
}
