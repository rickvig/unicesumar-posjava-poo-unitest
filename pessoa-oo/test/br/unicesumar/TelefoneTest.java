package br.unicesumar;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.unicesumar.pessoa.Telefone;

public class TelefoneTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	private Telefone subject;

	@Test
	public void testConstrutorDefault() {
		exception.expect(RuntimeException.class);
		exception.expectMessage("Não use este construtor");
		
		subject = new Telefone();
	}

	@Test
	public void testTelefoneEntradas() {
		Telefone t1 = new Telefone("44999410923");
		Telefone t2 = new Telefone("44 999410923");
		Telefone t3 = new Telefone("44 9 99410923");
		Telefone t4 = new Telefone("44 9 9941-0923");
		Telefone t5 = new Telefone("(44)999410923");
		Telefone t6 = new Telefone("(44) 999410923");
		Telefone t7 = new Telefone("(44) 9 99410923");
		Telefone t8 = new Telefone("(44) 9 9941-0923");		

		List<Telefone> telefones = asList(t1, t2, t3, t4, t5, t6, t7, t8);
		
		for (Telefone t : telefones) {
			System.out.println(t);
//			assertTrue(t.isValido());		
		}
	}

	@Test
	public void testTelefoneInvalido() {
		exception.expect(RuntimeException.class);
		exception.expectMessage("Telefone inválido!");
		
		subject = new Telefone("123");
	}

	@Test
	public void testTelefoneDoParana() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testTelefoneFormatado() {
		fail("Not yet implemented");
	}

}
