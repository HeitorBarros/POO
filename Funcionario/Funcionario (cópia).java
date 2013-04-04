import java.util.Scanner;

class Funcionario{

	protected String nome;
	protected double salario;
	protected int cpf;

	//CONSTRUTOR
	Funcionario(){
		salario =1000;
	}

	Funcionario(String n, double s, int c){
		nome=n;
		mudaSalario(s);
		cpf=c;
	}

	void mudaSalario(){
		System.out.println("Digite o novo Salário:");		
		Scanner n = new Scanner(System.in);
		salario = n.nextDouble();
	}
	void mudaSalario(double valor){
		if(valor<678)
			System.out.println("Salário Inválido!");
		else
			this.salario=valor;
	}

	public static void main(String[] args){
		Funcionario f1;
		f1 = new Funcionario("João", 850, 59936832);

		f1.salario =100;
		Funcionario f2 = new Funcionario();
		System.out.println(f1.salario);
		f1.mudaSalario(1500.00);
		System.out.println(f1.salario);

	}

}
