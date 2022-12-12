package com.xworkz.crud.boot;

import com.xworkz.crud.repository.SweetNameRepository;
import com.xworkz.crud.repository.SweetNameRepositoryImpl;

public class SweetNameRunner {

	public static void main(String[] args) {
		SweetNameRepository sweetNameRepository = new SweetNameRepositoryImpl();
		sweetNameRepository.create("MysorePak");
		sweetNameRepository.create("Jamun");
		System.out.println(sweetNameRepository.total());
		
		
	}
	
}
