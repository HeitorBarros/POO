package br.ifal.arapiraca.biblioteca.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.ifal.arapiraca.biblioteca.PersistenteEmBanco;

public class Tipo1 implements PersistenteEmBanco{

	@Override
	public void salvar() {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public void deletar() {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public void recuperar() {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public void atualizar() {
		// TODO Stub de método gerado automaticamente
		
	}
	
	public static void mostrarNaTela(PersistenteEmBanco p){
		p.recuperar();
	}
	
	public static void main(String[] args) {
		

		List l;
		l = new ArrayList();
		
 	}
	

}
