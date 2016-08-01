package br.edu.ufal.application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("./META-INF/hibernate.cfg.xml")
				.buildSessionFactory();
		
//		User u = new User();
//		u.setNome("ANTHONY");
		// Abrindo uma sessão junto ao Banco ed Dados
		Session session = sessionFactory.openSession();

		session.beginTransaction();

		// Salvar no Banco
//		session.save(u);

		// Enviar a sessão para o banco
		session.getTransaction().commit();

		// Fecha a sessão com o banco
		session.close();

	}
}
