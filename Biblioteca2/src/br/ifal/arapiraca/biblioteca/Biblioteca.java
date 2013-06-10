package br.ifal.arapiraca.biblioteca;

public class Biblioteca {

	public Livro cadastrarLivro(String titulo, String autor, String isbn, String editora){
		
		Livro novoLivro = new Livro(titulo, autor, isbn, editora);
		
		//SALVAR O LIVRO EM ALGUM LUGAR
		// BANCO DE DADOS
		// ARQUIVO
		
		return novoLivro;
		
	}
	
	public Usuario cadastrarUsuario(String nome, String codigo, int tipo){
		Usuario novoUsuario;
		if (tipo==1) {
			 novoUsuario = new AlunoTecnico(nome, codigo);
		}else if (tipo==2) {
			novoUsuario = new AlunoSuperior(nome, codigo);
		}else if (tipo==3){
			novoUsuario = new Professor(nome, codigo);
		}else {
			return null;
		}
		
		
		//SALVAR O USUARIO EM ALGUM LUGAR
				// BANCO DE DADOS
				// ARQUIVO
		
		return novoUsuario;
	}
	
	public void locarLivro(Livro livro, Usuario usuario){
		if (livro.isEstaLocado()) {
			System.out.println("Livro já locado.");
			return;
		}
		
		// Verificar se o usuario pode locar livro
				// tipo 1 = aluno técnico
				// tipo 2 = aluno superior
				// tipo 3 = professor
		if (usuario.podeLocar()) {
			usuario.adicionarLivro();
			livro.setEstaLocado(true);
		}else{
			System.out.println("O usuário não pode locar mais livros");
			return;
		}
		System.out.println(usuario.getNome()+" locando livro "+livro.getTitulo());
		
	}
	
	public void devolverLivro(Usuario usuario, Livro livro){
		
		usuario.removerLivro();
		livro.setEstaLocado(false);
		System.out.println(usuario.getNome()+" devolvendo livro "+livro.getTitulo());
		
	}
	
	public void reservarLivro(){
		
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Biblioteca bibliotecaIfal = new Biblioteca();
		
		Livro livro1 = new Livro("Harry Potter", "JK", "583917414", "Aquela");
		Livro livro2 = new Livro("O Senhor dos Anéis: a Sociedade do Anel", "Tolkien", "5839174134", "Aquela outra");
		Livro livro3 = new Livro("O Senhor dos Anéis: as Duas Torres", "Tolkien", "5839174134", "Aquela outra");
		Livro livro4 = new Livro("O Senhor dos Anéis: O Retorno do Rei", "Tolkien", "58395374134", "Aquela outra");
		Livro livro5 = new Livro("Dicionario", "...", "817498174", "IFAL");
		Livro livro6 = new Livro("Dicionario Ingles-Português", "Gringo", "5838275", "IFAL");
		
		// tipo -> aluno tecnico = 1; aluno superior = 2; professor = 3;
		Usuario alunoTecnico1 = bibliotecaIfal.cadastrarUsuario("João", "37471", 1);
		Usuario alunoSuperior1 = bibliotecaIfal.cadastrarUsuario("Joana", "37473", 2);
		Usuario professor1 = bibliotecaIfal.cadastrarUsuario("Heitor", "37433", 3);
		
		//professor locando livro
		bibliotecaIfal.locarLivro(livro4, professor1);
		//aluno técnico locando livros
		// livro4 já está locado
		bibliotecaIfal.locarLivro(livro4, alunoTecnico1);
		bibliotecaIfal.locarLivro(livro1, alunoTecnico1);
		bibliotecaIfal.locarLivro(livro2, alunoTecnico1);
		bibliotecaIfal.locarLivro(livro3, alunoTecnico1);
		// professor Devolvendo livro
		bibliotecaIfal.devolverLivro(professor1, livro4);
		// aluno tentando locar livro, mas com limite excedido
		bibliotecaIfal.locarLivro(livro4, alunoTecnico1);
		

	}

}
