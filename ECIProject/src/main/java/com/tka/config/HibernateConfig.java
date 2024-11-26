package com.tka.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.ECIEntity.Candidate;

public class HibernateConfig {
	
	public static  SessionFactory getFactory() {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory sf = cfg.buildSessionFactory();
		
		
		return sf;
	}
	

}
