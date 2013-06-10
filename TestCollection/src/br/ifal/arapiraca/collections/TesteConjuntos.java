package br.ifal.arapiraca.collections;

import java.util.HashSet;
import java.util.Set;

public class TesteConjuntos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<Integer> conjunto = new HashSet<>();
		
		conjunto.add(10);
		conjunto.add(23);
		conjunto.add(13);
		
		System.out.println(conjunto.size());
		System.out.println(conjunto);
		
		conjunto.remove(10);
		System.out.println(conjunto);
				

	}

}
