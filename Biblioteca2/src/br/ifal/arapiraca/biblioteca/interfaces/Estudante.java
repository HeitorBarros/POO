package br.ifal.arapiraca.biblioteca.interfaces;

import br.ifal.arapiraca.biblioteca.PersistenteEmBanco;

public class Estudante implements Imprimivel, PersistenteEmBanco, Cloneable, Comparable, Runnable{

	public String nome;
	public String turma;
	public Estudante(String nome, String turma) {
		super();
		this.nome = nome;
		this.turma = turma;
	}
	
	public void imprimir(){
		System.out.println("Aluno: ");
		System.out.println("nome -> "+nome);
		System.out.println("Turma -> "+ turma);
	}

	@Override
	public void salvar() {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public void deletar() {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public void recuperar() {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public void atualizar() {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public void run() {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Stub de método gerado automaticamente
		return 0;
	}
	
}
