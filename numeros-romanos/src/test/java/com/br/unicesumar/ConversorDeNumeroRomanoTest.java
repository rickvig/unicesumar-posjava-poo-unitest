package com.br.unicesumar;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		assertEquals(2, romano.converte("II"));
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

}
