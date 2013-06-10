package br.ifal.arapiraca.biblioteca;

public abstract class Usuario {

	private String nome;
	private String codigo;
	private int qtdeLivros;
	
	public Usuario(String nome, String codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		qtdeLivros =0;
	}
	public Usuario() {
		super();
		qtdeLivros =0;
		// TODO Stub de construtor gerado automaticamente
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getQtdeLivros() {
		return qtdeLivros;
	}
	public void setQtdeLivros(int qtdeLivros) {
		this.qtdeLivros = qtdeLivros;
	}
	public void adicionarLivro(){
		qtdeLivros++;
	}
	public void removerLivro(){
		qtdeLivros--;
	}
	
	public abstract boolean podeLocar();
	
}
