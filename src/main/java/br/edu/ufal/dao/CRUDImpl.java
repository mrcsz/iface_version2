package br.edu.ufal.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import br.edu.ufal.model.Chat;
import br.edu.ufal.model.Msg;
import br.edu.ufal.model.User;

public class CRUDImpl {

	final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	final SessionFactory sessionFactory = new Configuration().configure("./META-INF/hibernate.cfg.xml")
			.buildSessionFactory();

	Session session = threadLocal.get();

		
	public void addInstance(User instance) {
		session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			session.save(instance);

			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}

	}

	public void updateInstance(User instance) {

		session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			session.update(instance);
			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}

	}
	
	public void updateInstance(Chat instance) {

		session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			session.update(instance);
			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}

	}
	
	public void addInstance(Chat chat, Msg msg) {

		session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			session.save(chat);
			session.save(msg);
			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}

	}
	
	public void addInstance(Msg instance) {

		session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			session.save(instance);
			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}

	}

	public void deleteInstance(User instance) {

		session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			session.delete(instance);
			session.getTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}

	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<User> getAllInstances() {
		session = sessionFactory.openSession();
		List<User> list = null;

		try {
			session.beginTransaction();

			list = session.createCriteria(User.class).list();

			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}

		return list;

	}

	public User autheticationUser(String email, String password) {
		session = sessionFactory.openSession();

		try {
			session.beginTransaction();

			@SuppressWarnings("deprecation")
			Criteria crit = session.createCriteria(User.class);
			crit.add(Restrictions.eq("email", email));
			crit.add(Restrictions.eq("password", password));
			crit.setMaxResults(1);

			User user = (User) crit.uniqueResult();

			session.close();
			return user;
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}

		return null;
	}

	public User getInstanceId(int idUser) {
		session = sessionFactory.openSession();

		try {
			session.beginTransaction();

			@SuppressWarnings("deprecation")
			Criteria crit = session.createCriteria(User.class);
			crit.add(Restrictions.eq("id", idUser));
			crit.setMaxResults(1);

			User user = (User) crit.uniqueResult();

			session.close();

			return user;

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}
		return null;
	}

	public boolean checkForEqualEmail(String email) {
		session = sessionFactory.openSession();

		try {
			session.beginTransaction();

			@SuppressWarnings("deprecation")
			Criteria crit = session.createCriteria(User.class);
			crit.add(Restrictions.eq("email", email));
			crit.setMaxResults(1);

			User user = (User) crit.uniqueResult();

			session.close();

			return user != null;

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		}
		return false;
	}
}
