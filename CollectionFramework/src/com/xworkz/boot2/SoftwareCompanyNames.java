package com.xworkz.boot2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanyNames {

	public static void main(String[] args) {
		Collection<String> companies = new ArrayList<String>();
		//service based
		companies.add("Infosys");
		companies.add("HCL Technologies");
		companies.add("Wipro Limited");
		companies.add("Redington India Ltd");
		companies.add("Tech Mahindra Limited");
		companies.add("Deloitte Touche Tohmatsu Limited");
		companies.add("Larsen and Toubro Limited");
		companies.add("Mphasis Limited");
		companies.add("Tata Consultancy Service");
		// product based
		companies.add("Adobe");
		companies.add("Amazon");
		companies.add("FaceBook");
		companies.add("Google");
		companies.add("Microsoft");
		companies.add("Hewlett-Packard (HP)");
		companies.add("Intel");
		companies.add("Paypal");
		companies.add("Salesforce");
		companies.add("Flipkart");
		companies.add("Oracle");

		System.out.println(companies.size());
		System.out.println(companies+"\n");
		
		for (String company : companies) {
			System.out.println(company);
		}
		System.out.println("\n Iterator=====> \n");
		
		Iterator<String> name = companies.iterator();
		while (name.hasNext()) {
			String company = (String) name.next();
			System.out.println(company);
		}
	}
	
}
