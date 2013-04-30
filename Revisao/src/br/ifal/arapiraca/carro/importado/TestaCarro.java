package br.ifal.arapiraca.carro.importado;

import br.ifal.arapiraca.carro.Carro;



public class TestaCarro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 10;
		
		Carro carraum = new Carro();
		carraum.ligar();
		
		carraum.setAno(2012);
		System.out.println(carraum.getAno());
	

	}

}
