package br.ifal.arapiraca.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno implements Comparable<Aluno>{

	public String nome;
	public double nota;
	
	public Aluno(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<>();
		
		alunos.add(new Aluno("João",7.0));
		alunos.add(new Aluno("Ana", 6.0));
		alunos.add(new Aluno("Heitor", 3.0));
		
		System.out.println(alunos);
		
		Collections.sort(alunos);
		
		System.out.println(alunos);		

	}
	
	@Override
	public String toString() {
		// TODO Stub de método gerado automaticamente
		return "Nome: "+nome+" Nota: "+nota;
	}


	@Override
	public int compareTo(Aluno a2) {
		return a2.nome.compareTo(this.nome);
	}

}
