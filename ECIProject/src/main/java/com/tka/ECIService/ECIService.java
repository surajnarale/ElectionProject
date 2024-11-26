package com.tka.ECIService;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tka.ECIDao.ECIDao;
import com.tka.ECIEntity.Candidate;
import com.tka.config.HibernateConfig;

public class ECIService {

	ECIDao dao = new ECIDao();

	public List<Candidate> getAllCandidateList() {
		// TODO Auto-generated method stub

		System.out.println("we are in the Service");

		ECIDao dao = new ECIDao();
		List<Candidate> allCandidateList = dao.getAllCandidateList();

		return null;

	}

	public String InsertData(Candidate candidate) {

		Candidate ObjFromDb = dao.InsertData(candidate);
		if (ObjFromDb != null) {
			return "Object Inserted";

		}

		return null;

	}

}
