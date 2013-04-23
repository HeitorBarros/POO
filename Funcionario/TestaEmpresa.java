class TestaEmpresa{

	public static void main(String[] args){

		Empresa empresa = new Empresa();
		
		Funcionario f1 = new Funcionario();
		f1.salario = 1000;
		f1.nome = "Ana";

		Funcionario f2 = new Funcionario();
		f2.salario = 1700;
		f2.nome = "Tiago";
		empresa.adiciona(f2);
		empresa.adiciona(f1);

		for (int i = 0; i < 5; i++) {
			Funcionario f = new Funcionario();
			f.salario = 1000 + i * 100;
			f.nome = "Dom Pedro " +i+"º";
			empresa.adiciona(f);
		}	

		empresa.mostraEmpregados();

	
	}

}
