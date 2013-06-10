package br.ifal.arapiraca.biblioteca;

public class Usuario {

	private String nome;
	private String codigo;
	private int tipo;
	private int qtdeLivros;
	
	public Usuario(String nome, String codigo, int tipo2) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.tipo = tipo2;
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
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
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
}
