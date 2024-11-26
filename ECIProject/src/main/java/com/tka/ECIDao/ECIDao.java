package com.tka.ECIDao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tka.ECIEntity.Candidate;
import com.tka.config.HibernateConfig;

public class ECIDao {

	public List<Candidate> getAllCandidateList() {
		
		System.out.println("we are int the dao layer");
		
		
		// TODO Auto-generated method stub
		return null;
		
	}
	public Candidate InsertData(Candidate candidate) {
		
		SessionFactory sf = HibernateConfig.getFactory();
		Session session = sf.openSession();
		
	
		Transaction tx = session.beginTransaction();
		session.save(candidate);
		
		tx.commit();
		
	
		Candidate candidate2 = session.get(Candidate.class, 456);
		
		
		
		return candidate2;
		
	}
	

}
