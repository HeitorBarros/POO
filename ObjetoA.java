class ObjetoA{
	int valorA;

	void imprimeValor(ObjetoA objeto){ // objeto = a3
		System.out.println(this.valorA);// objeto que chamou a função
		System.out.println(valorA); //objeto que chamou a função
		System.out.println(objeto.valorA); // objeto passado por referência 'a3'
	}

	public static void main(String[] args){
		ObjetoA a1 = new ObjetoA();
		ObjetoA a2 = new ObjetoA();
		ObjetoA a3 = new ObjetoA();
		a1.valorA=10;
		a2.valorA=7;
		a3.valorA=3;
		
		a2.imprimeValor(a3);
	}
}

