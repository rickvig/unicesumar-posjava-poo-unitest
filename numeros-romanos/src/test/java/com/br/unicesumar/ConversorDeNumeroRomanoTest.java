package com.br.unicesumar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ConversorDeNumeroRomanoTest {

	@Test
	public void deveEntenderOsSimbolosBasicos() {
		ConverteRomanoEmInteiro conversor = new ConverteRomanoEmInteiro();

		assertEquals(1, conversor.converte("I"));
		assertEquals(5, conversor.converte("V"));
		assertEquals(10, conversor.converte("X"));
		assertEquals(50, conversor.converte("L"));
		assertEquals(100, conversor.converte("C"));
		assertEquals(500, conversor.converte("D"));
		assertEquals(1000, conversor.converte("M"));

	}

	@Test
	public void deveEntenderDoisSimbolosComoII() {
		ConverteRomanoEmInteiro romano = new ConverteRomanoEmInteiro();
		assertEquals(4, romano.converte("IIII"));
	}

	@Test
	public void deveEntenderQuatroSimbolosDoisADoisComoXXII() {
		ConverteRomanoEmInteiro romano = new ConverteRomanoEmInteiro();
		assertEquals(22, romano.converte("XXII"));
	}

	@Test
	public void deveEntenderNumerosComoIX() {
		ConverteRomanoEmInteiro romano = new ConverteRomanoEmInteiro();
		assertEquals(9, romano.converte("IX"));
	}

	@Test
	public void deveEntenderNumerosComplexosComoXXIV() {
		ConverteRomanoEmInteiro romano = new ConverteRomanoEmInteiro();
		int numero = romano.converte("XXIV");
		assertEquals(24, numero);
	}
	
	@Test
	public void deveEntenderNumerosComplexosComoMMXX() {
		ConverteRomanoEmInteiro romano = new ConverteRomanoEmInteiro();
		int numero = romano.converte("MMXX");
		assertEquals(2020, numero);
	}
	
	@Test
	public void naoDeveEntenderNumerosInvalidos() {		
		
		NumeroRomanoException exception = assertThrows(NumeroRomanoException.class, () -> {
			ConverteRomanoEmInteiro romano = new ConverteRomanoEmInteiro();
			romano.converte("IIII");
	    });
	 
	    String expectedMessage = "REGRA I - so pode ter tres consecutivos";
	    String actualMessage = exception.getMessage();
	 
	    assertTrue(actualMessage.contains(expectedMessage));
		
	}

}
