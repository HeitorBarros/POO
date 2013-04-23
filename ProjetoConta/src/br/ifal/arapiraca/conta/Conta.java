package br.ifal.arapiraca.conta;

public class Conta {
	
	private double saldo;

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public void sacar(double valor){
		
		this.saldo = this.saldo - valor;
		System.out.println("Saque realizado. Saldo atual: "+this.saldo);
		
	}
	
	public void depositar(double valor){
		this.saldo = this.saldo +valor;
		System.out.println("Saque realizado. Saldo atual: "+this.saldo);
		
	}

}
