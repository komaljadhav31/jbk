package com.jbk.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import com.kj.hb.Student;

public class client1 {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
	}

}
