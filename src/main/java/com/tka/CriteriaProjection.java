package com.tka;

import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CriteriaProjection {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//select * from car
		Criteria critera = session.createCriteria(Car.class);
		
		//select carname from car
		Projection projection1 = Projections.property("company");
		//select cost from car
		Projection projection2 = Projections.property("cost");
		
		ProjectionList projection = Projections.projectionList();
		projection.add(projection1);
		projection.add(projection2);
		
		critera.setProjection(projection);
		
		List<Object[]> listCar = critera.list();
		
		for(Object[] car : listCar) {
			for (Object objects : car) {
				System.out.println(objects.toString());
			}
		}
		
	}

}
