package br.com.curso.entities;

public class Departamento {
	private String nomeDepartamento;

	public Departamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}

	public Departamento() {
	}

	public String getNome() {
		return nomeDepartamento;
	}

	public void setNome(String nome) {
		this.nomeDepartamento = nome;
	}

}
