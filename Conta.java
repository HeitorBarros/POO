import java.util.Scanner;

public class Conta{

	//Atributos
	int numero; // Numero da conta
	String dono; //Nome do dono da conta
	double saldo; // Saldo da conta

	//Métodos
	void criarConta(String nome, int num, double valor){
		dono = nome;
		numero = num;
		saldo = valor;
	}

	void sacar(double valor){
		saldo = saldo - valor;
		System.out.println("Sacando "+valor+" reais da conta.");
		System.out.println("Saldo atualizado: "+saldo);
	}

	void depositar(double valor){
		saldo = saldo + valor;
		System.out.println("Depositando "+valor+" reais na conta.");
		System.out.println("Saldo atualizado: "+saldo);
	}

	void mostrarDono(){
		System.out.println("O dono da conta é: "+dono);
	}

	void mostrarSaldo(){
		System.out.println("O saldo da conta é: "+saldo);
	}

	void transferir(Conta c, double valor){
		saldo= saldo - valor;
		c.saldo = c.saldo + valor;

		System.out.println("Transferência realizada.");
		System.out.println("Saldo atualizado da Conta debitada: "+saldo);
		System.out.println("Saldo atualizado da Conta creditada: "+c.saldo);

	}


	public static void main(String[] args){
/*		Conta c2 = new Conta();
		c2.criarConta("Ana", 942324,600);
		c2.mostrarSaldo();
		c2.mostrarDono();
		Conta c1 = new Conta();
		c1.criarConta("joão", 353772,400);
		//TRANSFERIR?
		
		c2.transferir(c1,100);*/









	int option=0, numContas=0, num;
	double s;
	Scanner leitor = new Scanner (System.in);
	Conta[] contas = new Conta[10];
		
	do{
		System.out.println("Digite uma opção: (8- para ver as opções):");
		

		option=leitor.nextInt();
		switch(option){
			case 1://criar conta
			System.out.println("Digite o valor do saldo:");
			s = leitor.nextDouble();
			System.out.println("Digite o nome do titular:");
			String nome = leitor.next();
			System.out.println("O numero da conta é: "+numContas);
			System.out.println("Conta criada com sucesso!");

			contas[numContas] = new Conta();
			contas[numContas].criarConta(nome,numContas,s);
			numContas++;
			break;
			//saldo
			case 2:
			System.out.println("Digite o Número da conta:");
			num = leitor.nextInt();
			if(num<0||num>numContas)
				System.out.println("Conta inválida!");
			else
				contas[num].mostrarSaldo();

			break;
			//sacar
			case 3:			
			System.out.println("Digite o Número da conta:");
			num = leitor.nextInt();
			System.out.println("Digite o valor do saque:");
			s = leitor.nextDouble();
			contas[num].sacar(s);
			break;
			//depositar

			case 4:
			System.out.println("Digite o Número da conta:");
			num = leitor.nextInt();
			System.out.println("Digite o valor do depósito:");
			s = leitor.nextDouble();
			contas[num].depositar(s);
			break;

			case 5:
			System.out.println("Digite o Número da conta que será DEBITADA:");
			num = leitor.nextInt();
			System.out.println("Digite o Número da conta que será CREDITADA:");
			int num2 = leitor.nextInt();
			System.out.println("Digite o valor da transferência:");
			s = leitor.nextDouble();
			contas[num].transferir(contas[num2],s );

			break;
			case 8:
			System.out.println("1- Criar conta");
			System.out.println("2- Ver saldo");
			System.out.println("3- Sacar");
			System.out.println("4- Depositar");
			System.out.println("5- Transferir");
			System.out.println("0- Sair");	
			break;			

			
		}

		
	}while(option!=0);		
		




	}



}
