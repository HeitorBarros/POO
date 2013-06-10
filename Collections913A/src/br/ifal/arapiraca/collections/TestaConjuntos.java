package br.ifal.arapiraca.collections;

import java.util.HashSet;
import java.util.Set;

public class TestaConjuntos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<String> conjunto = new HashSet<>();
		
		conjunto.add("João");
		conjunto.add("Maria");
		conjunto.add("João");
		conjunto.add("João");
		conjunto.add("João ");
		conjunto.add("João");
		conjunto.add("Ana");
		conjunto.add("Tiago");
		
		System.out.println(conjunto);
		
		conjunto.remove("João");
		
		System.out.println(conjunto);
		
		
		for (String string : conjunto) {
			System.out.println("aluno: "+string);
		}

	}

}
