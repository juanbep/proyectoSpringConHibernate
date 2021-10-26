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
			Clientes cliente1 = new Clientes("Juan","Beca","Calle 65 N 16-28");
		}finally {
			myFactory.close();
		}
		
		
	}

}
