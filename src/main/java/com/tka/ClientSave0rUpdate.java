package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientSave0rUpdate {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		Car car = new Car(1,"PreD", "Taa", "200000");
		session.saveOrUpdate(car);
		transaction.commit();
	}

}
