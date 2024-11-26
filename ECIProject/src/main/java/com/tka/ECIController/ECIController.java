package com.tka.ECIController;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tka.ECIEntity.Candidate;
import com.tka.ECIService.ECIService;
import com.tka.config.HibernateConfig;

public class ECIController {
	
	
	ECIService service = new ECIService();

	public List<Candidate> getAllCandidateList() {
		
		System.out.println("We are in the Controller");
		
		ECIService service = new ECIService();
	 
		 List<Candidate> allCandidateList = service.getAllCandidateList();
		
		return null;
		// TODO Auto-generated method stub
		
	}
	
	
public String InsertData(Candidate candidate) {
		
		
		
		
		
		return service.InsertData(candidate);
		
	}

}
