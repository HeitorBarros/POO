package br.ifal.arapiraca.vendas;

import br.ifal.arapiraca.carro.Carro;

public class VendeCarro {

	public void vender(Carro c){
		System.out.println("vendendo carro do modelo "+c.getModelo());
		System.out.println("carro do tipo: ");
		c.dizTipo();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente

	}

}
