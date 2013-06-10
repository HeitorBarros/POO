package br.ifal.arapiraca.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Conta implements Comparable<Conta>{

	public int numero;
	
	public Conta(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public String toString() {
	
		return ""+numero;
	}


	public static void main(String[] args) {
		
		List<Conta> contas = new ArrayList<>();
		
		contas.add(new Conta(49));
		contas.add(new Conta(10));
		contas.add(new Conta(34));
		
		Collections.sort(contas);
		
		System.out.println(contas);
		
	}

	@Override
	public int compareTo(Conta c) {
		if (this.numero>c.numero) {
			return 1;
		}else if (this.numero<c.numero){
			return -1;
		}
		return 0;
	}
	
}
