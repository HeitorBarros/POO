package br.ifal.arapiraca.biblioteca.interfaces;

public class Aluno implements Comparable<Aluno>, Runnable,Cloneable{

	public double nota1;
	public double nota2;
	
	public Aluno(double nota1, double nota2) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	
	public int compareTo(Aluno o) {
		double media1 = (this.nota1+this.nota2)/2;
		double media2 = (o.nota1+o.nota2)/2;
		
		if (media1>media2) {
			return 1;
		}if (media1==media2) {
			return 0;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno(10, 7);
		Aluno a2 = new Aluno(8, 8);
		
		a1.compareTo(a2);
		
		
		
	}


	@Override
	public void run() {
		// TODO Stub de método gerado automaticamente
		
	}

}
