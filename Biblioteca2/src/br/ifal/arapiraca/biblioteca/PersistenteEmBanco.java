package br.ifal.arapiraca.biblioteca;

public interface PersistenteEmBanco {

	public void salvar();
	
	public void deletar();
	
	public void recuperar();
	
	public void atualizar();
	
}
