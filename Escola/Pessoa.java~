class Pessoa{

	long cpf;
	String nome;
	String nascimento;
	String sexo;


	Pessoa(long c, String n, String nasc, String s){
		if((c<=10000000000l)|| (c>99999999999l)){
			System.out.println("CPF INVÁLIDO, iniciando com valor padrão: 999.999.999-99");
			cpf=99999999999l;
		}else{
			cpf=c;
		}
		
		nome=n;
		
		nascimento=nasc;	
		
		if((s=="M")||(s=="F")){
			sexo=s;
		}else{
			System.out.println("Sexo armazenado como Indefinido.");
			sexo = "I";
		}
			
			
	}
}
