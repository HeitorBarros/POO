package br.ifal.arapiraca.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TesteListas {
	
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>(); 
		List<Integer> idades = new ArrayList<>();
		
		nomes.add("Juliana");
		nomes.add("Vanessa");
		nomes.add("Zé Paulo");
		nomes.add("Heitor");
		idades.add(13);
		nomes.add("Zezo");
		
		verifica(nomes);
		System.out.println(nomes.size());
		nomes.remove("Juliana");
		System.out.println(nomes.size());
		verifica(nomes);
		
		System.out.println(nomes);
		Collections.sort(nomes);
		System.out.println(nomes);

	}

	private static void verifica(List nomes) {
		if (nomes.contains("Juliana")) {
			System.out.println("Tem");
		} else {
			System.out.println("Não Tem");
		}
	}

}
