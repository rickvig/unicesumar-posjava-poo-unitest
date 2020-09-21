package com.br.unicesumar;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SalarioAdministradorTest {

	Administrador subject;
	Departamento mockedDepartamento = Mockito.mock(Departamento.class);
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
//		System.out.println("Executou antes de todos os Testes...");
	}
	
	@BeforeEach
	void setUp() {
//		System.out.println("Executou antes...");
		
		subject = new Administrador(mockedDepartamento);
		
		subject.setAnoDeTrabalho(5);
		subject.setTitulo(Titulo.MESTRADO);
		subject.setQuantidadeDeFaltas(1);
	}
	
	@Test
	void salarioDoAdministradorMestradoCom5AnosUmaFalta() {
		when(mockedDepartamento.getQuantidadeDeCursos()).thenReturn(0);
		
		assertThat(subject.getSalario(), equalTo(4838.8D));
	}
	
	@Test
	void salarioDoAdministradorMestradoCom5AnosUmaFaltaComDepartarmentoCom3Cursos() {
		when(mockedDepartamento.getQuantidadeDeCursos()).thenReturn(3);
		
		assertThat(subject.getSalario(), equalTo(5537.2D));
	}
	
	@AfterEach
	void tearDown() {
//		System.out.println("Executou depois...");
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
//		System.out.println("Executou depois de todos os testes...");
	}
	

}
