package com.tka;

import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CriteriaProjection2 {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//select * from car
		Criteria critera = session.createCriteria(Car.class);
		
		//select carname from car
		Projection projection = Projections.property("company");
		
		critera.setProjection(projection);
		
		List<String> listCar = critera.list();
		
		for(String car : listCar) {
			System.out.println(car);
		}
		
	}

}
