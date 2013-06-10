package br.ifal.arapiraca.biblioteca.interfaces;

public class Coordenador implements Imprimivel{

	public String nome;
	public String setor;
	public Coordenador(String nome, String setor) {
		super();
		this.nome = nome;
		this.setor = setor;
	}
	
	public void imprimir(){
		System.out.println("Coordenador: ");
		System.out.println("nome -> "+nome);
		System.out.println("setor -> "+ setor);
	}

}
