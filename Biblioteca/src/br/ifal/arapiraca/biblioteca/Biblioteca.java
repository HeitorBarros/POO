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
		
		Usuario novoUsuario = new Usuario(nome, codigo,tipo);
		
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
		switch(usuario.getTipo()){
		case 1:
			if (usuario.getQtdeLivros()<3) {
				usuario.adicionarLivro();
				livro.setEstaLocado(true);
			}else{
				System.out.println("O usuário não pode locar mais livros");
				return;
			}
			break;
		case 2:
			if (usuario.getQtdeLivros()<5) {
				usuario.adicionarLivro();
				livro.setEstaLocado(true);
			}else{
				System.out.println("O usuário não pode locar mais livros");
				return;
			}
			break;
		case 3:
			usuario.adicionarLivro();
			livro.setEstaLocado(true);
			break;
		default:
			System.out.println("código de usuário inválido");
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
		
		Livro livro1 = bibliotecaIfal.cadastrarLivro("Harry Potter", "JK", "583917414", "Aquela");
		Livro livro2 = bibliotecaIfal.cadastrarLivro("O Senhor dos Anéis: a Sociedade do Anel", "Tolkien", "5839174134", "Aquela outra");
		Livro livro3 = bibliotecaIfal.cadastrarLivro("O Senhor dos Anéis: as Duas Torres", "Tolkien", "5839174134", "Aquela outra");
		Livro livro4 = bibliotecaIfal.cadastrarLivro("O Senhor dos Anéis: O Retorno do Rei", "Tolkien", "58395374134", "Aquela outra");
		Livro livro5 = bibliotecaIfal.cadastrarLivro("Dicionario", "...", "817498174", "IFAL");
		Livro livro6 = bibliotecaIfal.cadastrarLivro("Dicionario Ingles-Português", "Gringo", "5838275", "IFAL");
		
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
