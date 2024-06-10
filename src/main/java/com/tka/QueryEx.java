package com.tka;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class QueryEx {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		//Query query = session.createQuery("from car");
		
		Query query = session.createQuery("from Car");
		List<Car> listCar = query.list();

		for (Car car : listCar) {
			System.out.println(car);
		}

	}

}
