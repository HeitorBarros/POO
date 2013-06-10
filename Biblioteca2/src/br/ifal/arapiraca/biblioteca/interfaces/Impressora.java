package br.ifal.arapiraca.biblioteca.interfaces;

public class Impressora {
	
	public void imprimir(Imprimivel i){
		System.out.println("Imprimindo registro: ");
		i.imprimir();
		System.out.println("Fim de registro");
	}
	
	public static void main(String[] args) {
		
		Impressora imp = new Impressora();
		
		Imprimivel[] imprimiveis = new Imprimivel[3];
		
		imprimiveis[0] = new Professor("Heitor","OO");
		imprimiveis[1] = new Estudante("Você", "923-A");
		imprimiveis[2] = new Coordenador("Enildo", "Academico");
		
		for (int i = 0; i < imprimiveis.length; i++) {
			imp.imprimir(imprimiveis[i]);
		}	
		
	}
	
}
