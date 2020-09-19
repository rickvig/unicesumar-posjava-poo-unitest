package com.br.unicesumar;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidadorDeNumeroRomanoTest {

	@Test
	void validaTresAlgarismoConsecutivos() {
		
		NumeroRomanoException exception = assertThrows(NumeroRomanoException.class, () -> {
	        ValidadorDeNumeroRomano.valida("IIII");
	    });
	 
	    String expectedMessage = "REGRA I - so pode ter tres consecutivos";
	    String actualMessage = exception.getMessage();
	 
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void validaTresAlgarismoConsecutivosValidosV() {
		
		NumeroRomanoException exception = assertThrows(NumeroRomanoException.class, () -> {
	        ValidadorDeNumeroRomano.valida("VV");
	    });
	 
	    String expectedMessage = "REGRA I - so pode ter tres consecutivos validos";
	    String actualMessage = exception.getMessage();
	 
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void validaTresAlgarismoConsecutivosValidosL() {
		
		NumeroRomanoException exception = assertThrows(NumeroRomanoException.class, () -> {
	        ValidadorDeNumeroRomano.valida("LL");
	    });
	 
	    String expectedMessage = "REGRA I - so pode ter tres consecutivos validos";
	    String actualMessage = exception.getMessage();
	 
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void validaTresAlgarismoConsecutivosValidosD() {
		
		NumeroRomanoException exception = assertThrows(NumeroRomanoException.class, () -> {
	        ValidadorDeNumeroRomano.valida("DD");
	    });
	 
	    String expectedMessage = "REGRA I - so pode ter tres consecutivos validos";
	    String actualMessage = exception.getMessage();
	 
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void validaTresAlgarismoConsecutivosValidosMaisDeTesNaoConsecutivos() {
		ValidadorDeNumeroRomano.valida("IVIIXI");
	}

}
