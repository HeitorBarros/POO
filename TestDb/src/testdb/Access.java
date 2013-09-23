package testdb;

import java.sql.*; 


public class Access {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		try //A captura de exceções SQLException em Java é obrigatória para usarmos JDBC.   
		   {  
		       // Este é um dos meios para registrar um driver  
			   Class.forName("com.mysql.jdbc.Driver").newInstance();  
		         
		       // Registrado o driver, vamos estabelecer uma conexão  
		       Connection con = DriverManager.getConnection("jdbc:mysql://localhost/produto","root","mysql123");
		       // Após estabelecermos a conexão com o banco de dados  
		       // Utilizamos o método createStatement de con para criar o Statement  
		       Statement stm = con.createStatement();    
		         
		       // Vamos executar o seguinte comando SQL :  
		       String SQL = "Select id, name from Produto";
		       //System.out.println(SQL);
		       //stm.execute("create table Produto(id Integer not null, name varchar(20), primary key (id))");
		       //stm.execute("insert into Produto (id, name) values(9, 'Projetor');");
		       // Definido o Statement, executamos a query no banco de dados  
		       ResultSet rs = stm.executeQuery(SQL);  
		         
		       // O método next() informa se houve resultados e posiciona o cursor do banco  
		       // na próxima linha disponível para recuperação  
		       // Como esperamos várias linhas utilizamos um laço para recuperar os dados  
		       while(rs.next())  
		       {  
		          // Os métodos getXXX recuperam os dados de acordo com o tipo SQL do dado:  
		          String id = rs.getString("id");  
		          String nome = rs.getString("name");  
		      
		          // As variáveis tit, aut e totalFaixas contém os valores retornados   
		          // pela query. Vamos imprimí-los  
		      
		          System.out.println("Id: "+id+" Nome: "+nome);  
		       }
		       
		       con.close();
		   }  
		   catch(SQLException e)  
		   {  
		       // se houve algum erro, uma exceção é gerada para informar o erro   
		       e.printStackTrace(); //vejamos que erro foi gerado e quem o gerou  
		   }

	}

}
