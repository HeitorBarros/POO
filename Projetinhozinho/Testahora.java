import java.util.Date;


public class Testahora {

	public static void main(String[] args) {
		Date date = new Date();
		
		//Dia do mês
		System.out.println("Data: "+date.getDate()+"/"+date.getMonth()+"/"+date.getYear());
		//Dia da Semana
		System.out.println("Dia da semana: "+date.getDay());
		//Hora
		System.out.println("Hora: "+date.getHours());
		//Minuto
		System.out.println("Minuto: "+ date.getMinutes());
		//Segundo
		System.out.println("Segundo: "+date.getSeconds());
	}
	
}
