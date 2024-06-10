package com.tka;

import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ClientCriteria {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria critera = session.createCriteria(Car.class);
		List<Car> listCar = critera.list();
		
		for(Car car : listCar) {
			System.out.println(car);
		}
		
	}

}
