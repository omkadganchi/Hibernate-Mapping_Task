package com.may28;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CarTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		cfg.addAnnotatedClass(Accident.class);
		
		SessionFactory ss = cfg.buildSessionFactory();
		Session s = ss.openSession();
		Transaction t = s.beginTransaction();
		
		Car c = new Car("McLaren");
		Accident a = new Accident("Dubai");
		c.setAccid(a);
		
		s.save(c);
		t.commit();
		
	}
}