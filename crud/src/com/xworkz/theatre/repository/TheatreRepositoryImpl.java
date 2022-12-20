package com.xworkz.theatre.repository;

import com.xworkz.theatre.dto.TheatreDTO;
import com.xworkz.theatre.exception.TheatreNumbersExceededException;

public class TheatreRepositoryImpl implements TheatreRepository {

	private TheatreDTO[] dtos = new TheatreDTO[10];
	private int theatreIndex;
	
	@Override
	public boolean open(TheatreDTO dto) {
		System.out.println("Running open(TheatreDTO dto)");
		if(this.theatreIndex>=this.dtos.length) {
			throw new TheatreNumbersExceededException("The size exceeded can't add more than theatres in the array..");
		}
		this.dtos[theatreIndex]=dto;
		System.out.println(dto+" saved at the index : "+theatreIndex);
		return true;
	}

}
