package br.com.alura.escola.academico.dominio.aluno;

public class Email {
	
	private String endereco;

	public Email(String endereco) {
		if (endereco == null || !endereco.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
			throw new IllegalArgumentException("Email inválido");
		}
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}
	
	
	
}
