

class Aluno extends Pessoa{

	String matricula;
	double mediaGeral;
	Turma turma;
	Nota[] notas;

	
	Aluno(long c, String n, String nasc, String s, 
			String m, double media, Turma t, Nota[]	notas1){
		super(c,n,nasc, s);
		
		matricula=m;
		mediaGeral=media;
		turma = t;
		notas= notas1;

	}

	public static void main(String[] args){
		Nota[] n = new Nota[1];
		Turma t = new Turma();
		Aluno a = new Aluno(149l,"Bill","11/3/1983","D","5538215", 5.5, t,n);

	}
}
