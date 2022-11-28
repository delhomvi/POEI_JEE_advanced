package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.User;
import util.HibernateUtil;

public class Main {
	public static void addPerso(User pers) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction trx = session.beginTransaction();
		try {
			session.save(pers);
			trx.commit();
		} catch (Exception e) {
			trx.rollback();
		}
	}
	public static void main(String[] args) {
		addPerso(new User("Didier","Drogba",50));
	}
}
