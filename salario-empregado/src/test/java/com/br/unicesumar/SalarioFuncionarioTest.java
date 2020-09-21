package com.br.unicesumar;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SalarioFuncionarioTest {

	@Test
	void salarioBaseDoFuncionario() {
		Fucionario funcionario = new Fucionario();
		
		assertThat(funcionario.getSalario(), equalTo(2000D));
	}
	
	@Test
	void salarioDoFuncionarioCom15Anos() {
		Fucionario funcionario = new Fucionario();
		
		funcionario.setAnoDeTrabalho(15);
		
		assertThat(funcionario.getSalario(), equalTo(4400D));
	}
	
	@Test
	void salarioDoFuncionarioComFaltaUmDia() {
		Fucionario funcionario = new Fucionario();
		
		funcionario.setAnoDeTrabalho(15);
		funcionario.setQuantidadeDeFaltas(1);
		
		assertThat(funcionario.getSalario(), equalTo(4262D));
	}
	
	@Test
	void salarioDoFuncionarioComFaltaDoisDia() {
		Fucionario funcionario = new Fucionario();
		
		funcionario.setAnoDeTrabalho(15);
		funcionario.setQuantidadeDeFaltas(2);
		
		assertThat(funcionario.getSalario(), equalTo(4174D));
	}

}


