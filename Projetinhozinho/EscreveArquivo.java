package br.ifal.arapiraca.arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscreveArquivo {
	
	public File criaArquivo(String nome){
		File arquivo = new File(nome );
		try {
			arquivo.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(arquivo.exists());
		return arquivo;
		
	}
	
	public void escreve(File arquivo, String texto){
		//construtor que recebe o objeto do tipo arquivo
		try {
			FileWriter fw = new FileWriter( arquivo );
			
			//construtor recebe como argumento o objeto do tipo FileWriter
			BufferedWriter bw = new BufferedWriter( fw );
			
			bw.write(texto);
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		//construtor que recebe também como argumento se o conteúdo será acrescentado
		//ao invés de ser substituído (append)
		//FileWriter fw = new FileWriter( arquivo, true );
		
	}
	
	
	public static void main(String[] args) throws IOException {
		EscreveArquivo gerenciador = new EscreveArquivo();
		File arquivo = gerenciador.criaArquivo("/home/heitor/AulaOO/HOJEEHTERCA");
		
		gerenciador.escreve(arquivo, "VA COMPRAR PAO AGORA!");
		
		
	}

}
