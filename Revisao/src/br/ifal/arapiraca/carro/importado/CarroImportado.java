package br.ifal.arapiraca.carro.importado;

import java.util.Iterator;

import br.ifal.arapiraca.carro.Carro;
import br.ifal.arapiraca.vendas.VendeCarro;

public class CarroImportado extends Carro{

	public CarroImportado(){
		System.out.println("Criando carro importado.");
	}
	public CarroImportado(String modelo, int marcha, int ano, String cor){
		super(modelo, marcha, ano, cor);
	}
	
	public void passarMarcha(){
		if(getMarcha_atual()<6){
			setMarcha_atual(getMarcha_atual() + 1);
			System.out.println("Passando de marcha. Marcha atual: "+getMarcha_atual());
		}else{
			System.out.println("Carro já está na marcha máxima");
		}
	}
	
	public void dizTipo(){
		System.out.println("Sou um carro importado.");
	}
	
	public void teste(){
		super.dizTipo();
	}
	
	public static void main(String[] args) {
		
		CarroImportado importado = new CarroImportado("Ferrari", 0, 2013, "Vermelha");
//		for (int i = 1; i<10;i++) {
//			importado.passarMarcha();
//			
//		}

		VendeCarro vendedor = new VendeCarro();
		
		vendedor.vender(importado);
		
		
		
	}
	
}
