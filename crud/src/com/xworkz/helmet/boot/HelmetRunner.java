package com.xworkz.helmet.boot;

import java.time.LocalDateTime;

import com.xworkz.helmet.constant.Color;
import com.xworkz.helmet.constant.Type;
import com.xworkz.helmet.dto.HelmetDTO;
import com.xworkz.helmet.repository.HelmetRepository;
import com.xworkz.helmet.repository.HelmetRepositoryImpl;
import com.xworkz.helmet.service.HelmetService;
import com.xworkz.helmet.service.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) {

		HelmetDTO dto = new HelmetDTO("Vinay", LocalDateTime.of(2022, 12, 15, 17, 21), "Om sir", LocalDateTime.now(),
				"Vega", 950D, Color.BLACK, Type.HYBRID);
		HelmetRepository repository = new HelmetRepositoryImpl();
		HelmetService service = new HelmetServiceImpl(repository);

		boolean success = service.validateAndSave(dto);
		System.out.println("\n success :" + success);

	}

}
