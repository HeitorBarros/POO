class TestaFuncionario{

	public static void main(String[] args){

		Empresa empresa = new Empresa();
		
		Funcionario f1 = new Funcionario();
		f1.salario = 1000;
		empresa.adiciona(f1);
		Funcionario f2 = new Funcionario();
		f2.salario = 1700;
		empresa.adiciona(f2);

		for (int i = 0; i < 5; i++) {
			Funcionario f = new Funcionario();
			f.salario = 1000 + i * 100;
			empresa.adiciona(f);
		}	

	
	}

}
