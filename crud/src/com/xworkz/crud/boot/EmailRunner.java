package com.xworkz.crud.boot;

import com.xworkz.crud.repository.EmailRepository;
import com.xworkz.crud.repository.EmailRepositoryImpl;

public class EmailRunner {

	public static void main(String[] args) {

		EmailRepository emailRepository = new EmailRepositoryImpl();
		emailRepository.create("om.bn@outlook.com");
		emailRepository.create("vinayhp.xworkz@gmail.com");
		emailRepository.create("akshara@xworkz.com");
		System.out.println(emailRepository.total());
		
		
	}

}
