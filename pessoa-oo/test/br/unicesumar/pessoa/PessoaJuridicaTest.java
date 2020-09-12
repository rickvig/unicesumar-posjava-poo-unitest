package br.unicesumar.pessoa;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import br.unicesumar.pessoa.CNPJ;
import br.unicesumar.pessoa.PessoaJuridica;

public class PessoaJuridicaTest {
	
	private PessoaJuridica subject;

	@Before
	public void setup() {
		
		Telefone telefone = new Telefone("44999410923");
		CNPJ cnpj = new CNPJ("84800290000148");
		
		subject = new PessoaJuridica("Henrique ltd", cnpj, asList(telefone));
		
	}

	@Test
	public void testSouDoTipo() {
		assertEquals(PessoaJuridica.class, subject.souDoTipo());
	}
	
	@Test
	public void testConstrutor() {
		assertNotNull(subject);
	}

	@Test
	public void testNomeFantasia() {
		subject.setNomeFantasia("Loja do Henrique");
		assertEquals("Loja do Henrique", subject.getNomeFantasia());
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
		assertTrue(subject.temEndereco());
	}
		
	@Test
	public void testRetornaCNPJFormatado() {
		assertEquals("84.800.290/0001-48", subject.getDocumentoFormatado());
	}

}
