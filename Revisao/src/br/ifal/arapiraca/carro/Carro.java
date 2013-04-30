package br.ifal.arapiraca.carro;

import br.ifal.arapiraca.vendas.VendeCarro;

public class Carro {
	// Atributos
	protected String cor;
	protected int ano;
	protected String modelo;
	private int marcha_atual;
	
	//Construtores
	public Carro(){
		System.out.println("Criando um carro!");
	}
	
	public Carro(String modelo, int marcha, int ano, String cor){
		System.out.println("Criando um carro!");
		this.modelo = modelo;
		this.setMarcha_atual(marcha);
		this.setAno(ano);
		this.cor = cor;
	}
	
	// Métodos
	public void ligar(){
		System.out.println("Carro ligado!");
	}
	public void passarMarcha(){
		if(getMarcha_atual()<5){
			setMarcha_atual(getMarcha_atual() + 1);
			System.out.println("Passando de marcha. Marcha atual: "+getMarcha_atual());
		}else{
			System.out.println("Carro já está na marcha máxima");
		}
	}
	public void passarMarcha(int m){
		if(m>0&&m<6){
			setMarcha_atual(m);
			System.out.println("Passando de marcha. Marcha atual: "+getMarcha_atual());
		}
	}
	public void reduzirMarcha(){
		if(getMarcha_atual()>1){
			setMarcha_atual(getMarcha_atual() - 1);
			System.out.println("Reduzindo marcha. Marcha atual: "+getMarcha_atual());
		}else{
			System.out.println("Carro já está na marcha mínima");
		}
	}
	
	public void dizTipo(){
		System.out.println("Sou um carro nacional!");
	}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Carro carrinho = new Carro("Fusca", 0, 1987, "Azul");
		carrinho.ligar();
		
		carrinho.passarMarcha(2);
		
//		System.out.println(carrinho.getMarcha_atual());
//		System.out.println(carrinho.cor);
		
		VendeCarro vendedor = new VendeCarro();
		vendedor.vender(carrinho);
		
		
		

	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		// RESTRIÇÕES
		this.ano = ano;
	}

	public int getMarcha_atual() {
		return marcha_atual;
	}

	public void setMarcha_atual(int marcha_atual) {
		this.marcha_atual = marcha_atual;
	}

	public String getModelo() {
		// TODO Stub de método gerado automaticamente
		return this.modelo;
	}

}
