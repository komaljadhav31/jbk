package com.jbk.hb;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tt = session.beginTransaction();

		//Student ss = new Student("komal","pune","ind","active");
	   // session.save(ss);
	    
	   // Student ss1=session.get(Student.class,6);
	   // session.delete(ss1);
	    
	    Student ss1=session.get(Student.class,7);
	   System.out.println(ss1.getScity()+" "+ss1.getSname());
	    tt.commit();
	    session.close();
		System.out.println("Data Stored Successfully");
	
	}

}
