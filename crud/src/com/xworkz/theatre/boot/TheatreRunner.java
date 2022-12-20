package com.xworkz.theatre.boot;

import com.xworkz.theatre.constant.Brand;
import com.xworkz.theatre.dto.TheatreDTO;
import com.xworkz.theatre.repository.TheatreRepository;
import com.xworkz.theatre.repository.TheatreRepositoryImpl;
import com.xworkz.theatre.service.TheatreService;
import com.xworkz.theatre.service.TheatreServiceImpl;

public class TheatreRunner {

	public static void main(String[] args) {

		TheatreDTO dto = new TheatreDTO(104552, "Navrang", Brand.BIG_CINEMAS, 250);
		TheatreRepository repository = new TheatreRepositoryImpl();
		TheatreService service = new TheatreServiceImpl(repository);
		boolean success = service.validateAndSave(dto);
		System.out.println("\n success :" + success+"\n");
		
		TheatreDTO dto1 = new TheatreDTO(0, "Prasanna", Brand.INOX, 150);
		boolean success1 = service.validateAndSave(dto1);
		System.out.println("\n success : " + success1+"\n");
	}

}
