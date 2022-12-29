package com.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import com.collection.dto.AirportDTO;

public class AirportRunner {

	public static void main(String[] args) {

		Collection<AirportDTO> dtos = new ArrayList<AirportDTO>();
		AirportDTO dto = new AirportDTO("Mysore Airport", "Mysore", "MYQ", "India");
		AirportDTO dto1 = new AirportDTO("Kempegowda International Airport", "Bengaluru", "BLR", "India");
		AirportDTO dto2 = new AirportDTO("Rajiv Gandhi International Airport", "Hyderbad", "HYD", "India");
		AirportDTO dto3 = new AirportDTO("Dubai International Airport", "Dubai", "DXB", "UAE");
		AirportDTO dto4 = new AirportDTO("Indira Gandhi International Airport", "Delhi", "DEL", "India");
		dtos.add(dto);
		dtos.add(dto1);
		dtos.add(dto2);
		dtos.add(dto3);
		dtos.add(dto4);

		boolean equals = dto.equals(dto1);
		System.out.println("equals : " + equals + "\n");
		System.out.println("equals : " + dto.equals(dto2) + "\n");
		System.out.println("equals : " + dto.equals(dto3) + "\n");
		System.out.println("equals : " + dto.equals(dto4) + "\n");

		boolean contains = dtos.contains(dto);
		System.out.println("dtos.contains(dto) : " + contains + "\n");
		System.out.println("dtos.contains(dt4) : " + dtos.contains(dto4) + "\n");
		System.out.println("dtos.contains(dto3) : " + dtos.contains(dto3) + "\n");
		System.out.println("dtos.contains(dto2) : " + dtos.contains(dto2) + "\n");
		System.out.println("dtos.contains(dto1) : " + dtos.contains(dto1) + "\n");


	}

}
