package com.br.unicesumar;

import java.util.HashMap;
import java.util.Map;

public class ValidadorDeNumeroRomano {
	
	private static Map<Character, Integer> tabela = new HashMap<Character, Integer>() {
		{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
		}
	};

	public static void valida(String numeroEmRomano) {
		
		int contador = 1;
		Character anterior = numeroEmRomano.charAt(0);
		
		for (Character romano : numeroEmRomano.toCharArray()) {
			 if (contador > 3)
			 	throw new NumeroRomanoException("REGRA I - so pode ter tres consecutivos");
			 
			 if (romano == anterior)
				 contador += 1;
			 else {
				 contador = 1;
				 anterior = romano;
			 }
			 
			 if (contador > 1 && (romano.equals('V') || romano.equals('L') || romano.equals('D')))
				 	throw new NumeroRomanoException("REGRA I - so pode ter tres consecutivos validos");
			 
			 
		}
	}

}
