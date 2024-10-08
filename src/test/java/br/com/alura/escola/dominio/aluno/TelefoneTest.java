package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.dominio.aluno.Telefone;

class TelefoneTest {

	@Test
	void naoDeveriaCriarTelefoneComDDDsInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone(null, "123456789"));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("", "123456789"));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("1", "123456789"));
	}
	@Test
	void naoDeveriaCriarTelefoneComNumeroInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("11", null));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("11", ""));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("11", "123"));
	}

@Test
void deveriaPermitirTelefoneComDDDENumerosValidos() {
	String ddd = "";
	String numero = "123456789";
	Telefone telefone = new Telefone(ddd, numero);
	assertEquals(ddd, telefone.getDdd());
	assertEquals(numero, telefone.getNumero());
	
	
}}
