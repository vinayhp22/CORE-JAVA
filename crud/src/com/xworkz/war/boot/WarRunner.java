package com.xworkz.war.boot;

import java.time.LocalDate;

import com.xworkz.war.dto.WarDTO;
import com.xworkz.war.repository.WarRepository;
import com.xworkz.war.repository.WarRepositoryImpl;

public class WarRunner {

	public static void main(String[] args) {

		WarRepository repository = new WarRepositoryImpl();
		WarDTO dto = new WarDTO("Russia - Ukrain", null, null, null, null, null, 0);
		WarDTO dto2 = new WarDTO("India-Pak", null, null, null, null, null, 0);
		WarDTO dto3 = new WarDTO("Kargil", null, null, null, null, null, 0);

		WarDTO[] dtos = {dto, dto2, dto3};
		repository.create(dto);
		System.out.println("\n");
		repository.create(dtos);
		
	}

}
