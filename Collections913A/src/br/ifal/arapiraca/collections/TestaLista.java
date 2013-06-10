package br.ifal.arapiraca.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestaLista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("João");
		lista.add("Gabriel");
		lista.add("Heitor");
		lista.add("Izabel");
		lista.add("José");
		
		
		if (lista.contains("José")) {
			System.out.println("Tem José");
		}else {
			System.out.println("Não tem José");
		}
		
		System.out.println(lista);
		
		
		System.out.println(lista.size());
		
		Collections.reverse(lista);
		
		System.out.println(lista);
		
	}

}
