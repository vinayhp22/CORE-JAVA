package com.xworkz.helmet.repository;

import com.xworkz.helmet.dto.HelmetDTO;
import com.xworkz.helmet.exception.HelmetSizeExceedException;

public class HelmetRepositoryImpl implements HelmetRepository {

	private HelmetDTO[] dtos = new HelmetDTO[5];
	private int currentIndex = 0;

	public boolean save(HelmetDTO dto) {
		System.out.println("\nRunning save(HelmetDTO dto)" + dto);
		if (currentIndex >= this.dtos.length) {
			System.out.println("Size exceeded can't add > 5 dtos");
			throw new HelmetSizeExceedException();
		}
		this.dtos[currentIndex] = dto;
		currentIndex++;
		System.out.println(currentIndex + " Helmet is saved : " + dto);
		return true;
	}

}
