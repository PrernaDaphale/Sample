package com.tka;

import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CriteriaWhere {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria critera = session.createCriteria(Car.class); //select * from car
		
		critera.add(Restrictions.eq("company", "Prerna")); //where condition
		
		List<Car> listCar = critera.list();
		
		for(Car car : listCar) {
			System.out.println(car);
		}
		
	}

}
