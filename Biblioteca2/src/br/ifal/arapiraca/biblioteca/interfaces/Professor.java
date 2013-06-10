package br.ifal.arapiraca.biblioteca.interfaces;

public class Professor implements Imprimivel{

	String nome;
	String disciplina;
	public Professor(String nome, String disciplina) {
		super();
		this.nome = nome;
		this.disciplina = disciplina;
	}
	
	public void imprimir(){
		System.out.println("Professor: ");
		System.out.println("nome -> "+nome);
		System.out.println("Disciplina -> "+ disciplina);
	}
	
}
