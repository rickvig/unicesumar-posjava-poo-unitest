package com.br.unicesumar;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalarioProfessorTest {
	
	Professor subject;
	
	@BeforeEach
	void setUp() {
		subject = new Professor();
	}

	@Test
	void salarioBaseDoProfessor() {
		assertThat(subject.getSalario(), equalTo(3000D));
	}
	
	@Test
	void salarioDoProfessorCom3Anos() {
		subject.setAnoDeTrabalho(3);
		assertThat(subject.getSalario(), equalTo(4080D));
	}
	
	@Test
	void salarioDoProfessorDoutorCom3Anos() {
		subject.setAnoDeTrabalho(3);
		subject.setTitulo(Titulo.DOUTORA);
		assertThat(subject.getSalario(), equalTo(4365.6D));
	}
	
	@Test
	void salarioDoProfessorDoutorCom3AnosDuasFaltas() {
		subject.setAnoDeTrabalho(3);
		subject.setTitulo(Titulo.DOUTORA);
		subject.setQuantidadeDeFaltas(2);
		assertThat(subject.getSalario(), equalTo(4053.664D));
	}

}
