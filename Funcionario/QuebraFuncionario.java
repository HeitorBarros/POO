class QuebraFuncionario{

	public static void main(String[] args){
		Funcionario f = new Funcionario(1000, "Marcelo", 153975134);
		f.mudaSalario(300);

		System.out.println(f.getSalario());

	}

}
