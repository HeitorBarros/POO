package br.ifal.arapiraca.biblioteca;

public class AlunoSuperior extends Usuario{
	
	public AlunoSuperior() {
		super();
		// TODO Stub de construtor gerado automaticamente
	}

	public AlunoSuperior(String nome, String codigo) {
		super(nome, codigo);
		// TODO Stub de construtor gerado automaticamente
	}

	public boolean podeLocar(){
		if (this.getQtdeLivros()<5) {
			return true;
		}
		return false;
	}
	
}
