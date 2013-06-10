package br.ifal.arapiraca.collections;

import java.util.HashMap;
import java.util.Map;

public class TestaMapas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> alunos = new HashMap<>();
		
		alunos.put(1, "João");
		alunos.put(2, "Maria");
		alunos.put(4, "Bartolomeu");
		alunos.put(593, "Israel");
		
//		System.out.println(alunos);
		
		alunos.put(2, "Tiago");
		alunos.put(9, "Tiago");
		
		System.out.println(alunos.keySet());
		
		for (Integer chave : alunos.keySet()) {
			System.out.println(chave+"-"+alunos.get(chave));
		}
		
		System.out.println(alunos.values());
		
//		alunos.clear();
		
		System.out.println(alunos.size());
		

	}

}
