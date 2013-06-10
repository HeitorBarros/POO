package br.ifal.arapiraca.biblioteca;

public class Livro {

	private String titulo;
	private String autor;
	private String isbn;
	private String editora;
	private boolean estaLocado;
	
	public Livro() {
		// TODO Stub de construtor gerado automaticamente
		estaLocado = false;
	}

	public Livro(String titulo, String autor, String isbn, String editora) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.editora = editora;
		this.estaLocado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public boolean isEstaLocado() {
		return estaLocado;
	}

	public void setEstaLocado(boolean estaLocado) {
		this.estaLocado = estaLocado;
	}
		
}
