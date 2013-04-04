class Gato extends Animal{

	void fale(){
		System.out.println("Miau! Miau");
	}

	void come(){
		System.out.println("Comendo ração de luxo!");
	}
	

	public static void main(String[] args){

		Gato fusquinha = new Gato();
		fusquinha.idade = 19;

		System.out.println(fusquinha.idade);
		fusquinha.fale();
		fusquinha.come();
	}

}
