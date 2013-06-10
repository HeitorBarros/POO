package br.ifal.arapiraca.biblioteca;

public class BibliotecaMain {
	
	public static void main(String[] args) {
		Usuario usuario = new AlunoSuperior();
		
		Usuario professor = new Professor();
		Usuario tecnico = new AlunoTecnico();
		
		usuario.podeLocar();
		professor.podeLocar();
		tecnico.podeLocar();
	}

}
