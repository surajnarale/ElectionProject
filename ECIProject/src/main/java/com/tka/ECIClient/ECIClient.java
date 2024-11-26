package com.tka.ECIClient;

import java.util.List;

import com.tka.ECIController.ECIController;
import com.tka.ECIEntity.Candidate;

public class ECIClient {
	public static void main(String[] args) {
		System.out.println("We are int the Client");
		Candidate can = new Candidate(456,"rahul joshi", "bjp","xyz","MH","male",30);
		ECIController controller = new ECIController();
		System.out.println(controller.InsertData(can));
		//List<Candidate>allcandidatelist=controller.getAllCandidateList();
		
	}

}
