package es.unicauca.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GuardarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory myFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		Session miSession = myFactory.openSession();
		
		try {
			
			Clientes cliente1 = new Clientes("Sandra","Suarez","Carrera 9 N 15-08");
			miSession.beginTransaction();
			miSession.save(cliente1);
			miSession.getTransaction().commit();
			System.out.println("Resgistro insertado correctamente en BBDD");
			
			//Lectura de registros 
			
			miSession.beginTransaction();
			System.out.println("Lectura de registro con Id: " + cliente1.getId());

			Clientes clienteInsertado = miSession.get(Clientes.class, cliente1.getId());
			
			System.out.println("Registro: " + clienteInsertado );
			
			miSession.getTransaction().commit();
			
			miSession.close();
			
			miSession.close();
		}finally {
			myFactory.close();
		}
		
		
	}

}
