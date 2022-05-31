package br.com.glandata.model;

public class Aluno {

	public String nome;
	public float nota1;
	public float nota2;
	public float nota3;

	public Boolean Aprovado() {
		return MediaAluno() >= 5;
	}

	private float MediaAluno() {
		return (nota1 + nota2 + nota3) / 3;
	}

}
