class Cachorro extends Animal{

	void fale(){
		System.out.println("Au! Au!");
	}

	public static void main(String[] args){

		Cachorro pluto = new Cachorro();
		pluto.idade = 8;

		System.out.println(pluto.idade);
		pluto.fale();
	}

}
