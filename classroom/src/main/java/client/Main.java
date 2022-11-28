package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Personne;
import util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction trx = session.beginTransaction();
		Personne bob = new Personne(3,"Marley","Bob");
		session.save(bob);
		trx.commit();
		}
}
