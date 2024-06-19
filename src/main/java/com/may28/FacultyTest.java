package com.may28;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FacultyTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Faculty.class);
		cfg.addAnnotatedClass(FacSub.class);
		
		SessionFactory ss = cfg.buildSessionFactory();
		Session s = ss.openSession();
		Transaction t = s.beginTransaction();
		
		Faculty f = new Faculty("Harshda Ma'am");
		FacSub fs = new FacSub("Operating Systems");
		FacSub fs1 = new FacSub("System Programming");
		
		Faculty f1 = new Faculty("Om sir");
		FacSub fs2 = new FacSub("data base");
		
		List<FacSub> fac1 = new ArrayList<FacSub>();
		fac1.add(fs2);
		
		List<FacSub> fac = new ArrayList<>();
		fac.add(fs);
		fac.add(fs1);
		
		f.setAl(fac);
		f.setAl(fac1);
		
		
		s.save(f);
		s.save(f1);
		t.commit();
		
		
		
	}

}
