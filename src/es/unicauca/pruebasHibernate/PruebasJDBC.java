package es.unicauca.pruebasHibernate;

import java.sql.Connection;
import java.sql.DriverManager;



public class PruebasJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbcUrl = "jdbc:mysql://localhost:3306/pruebashibernate?useSSL=false";
		
		String usuario = "root";
		String contra = "1234";
		
		try {
			
			System.out.println("Intentando conectar con la base de datos "+jdbcUrl);
			Connection miConexion = DriverManager.getConnection(jdbcUrl, usuario, contra);
		    System.out.println("Conexi�n exitosa");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

		
	}

}
