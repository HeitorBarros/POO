package br.ifal.arapiraca.biblioteca;

public class AlunoTecnico extends Usuario{

	public AlunoTecnico() {
		super();
		// TODO Stub de construtor gerado automaticamente
	}

	public AlunoTecnico(String nome, String codigo) {
		super(nome, codigo);
		// TODO Stub de construtor gerado automaticamente
	}

	public boolean podeLocar(){
		if (this.getQtdeLivros()<3) {
			return true;
		}
		return false;
	}
	
}
