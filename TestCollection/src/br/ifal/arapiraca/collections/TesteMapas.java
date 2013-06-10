package br.ifal.arapiraca.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TesteMapas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<Integer, Conta> mapa = new HashMap<>();
		
		mapa.put(4814129, new Conta(432231));
		mapa.put(418412, new Conta(418417));
		mapa.put(35324, new Conta(3473432));
		
		System.out.println(mapa.get(418412));
		
	}

}
