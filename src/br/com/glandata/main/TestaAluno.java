package br.com.glandata.main;

import br.com.glandata.model.Aluno;

public class TestaAluno {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.nome = "Camila";
		aluno.nota1 = 5;
		aluno.nota2 = 10;
		aluno.nota3 = 8;

		String situacao = aluno.Aprovado() ? "aprovado(a)." : "reprovado(a).";

		System.out.println("Aluno(a) " + aluno.nome + " está " + situacao);

	}

}
