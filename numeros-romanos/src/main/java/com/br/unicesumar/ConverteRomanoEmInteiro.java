package com.br.unicesumar;

import java.util.HashMap;
import java.util.Map;

public class ConverteRomanoEmInteiro {

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

	public int converte(String numeroEmRomano) {
		ValidadorDeNumeroRomano.valida(numeroEmRomano);
		
		int acumulador = 0;
		int ultimoVizinhoDaDireita = 0;

		for (int i = numeroEmRomano.length() - 1; i >= 0; i--) {
		
			char romano = numeroEmRomano.charAt(i);
			int atual = tabela.get(romano);
		
			int multiplicador = 1;
			
			if (atual < ultimoVizinhoDaDireita)
				multiplicador = -1;
			
			acumulador += tabela.get(romano) * multiplicador;
		
			ultimoVizinhoDaDireita = atual;
		}
		
		return acumulador;
	}

}
