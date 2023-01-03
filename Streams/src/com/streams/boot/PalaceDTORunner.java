package com.streams.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.streams.dto.PalaceDTO;

public class PalaceDTORunner {

	public static void main(String[] args) {

		Collection<PalaceDTO> dtos = new LinkedList<PalaceDTO>();
		dtos.add(new PalaceDTO("Bengaluru Palace", "Bengaluru", "Rev J Garrett", true, 10));
		dtos.add(new PalaceDTO("Amba Vilas Palace", "Mysore", "Henry Irwin", false, 50));
		dtos.add(new PalaceDTO("Gol Gumbaz", "Bijapur", "Md Adil Shah", false, 100));
		dtos.add(new PalaceDTO("Tipu Sultan Summer Palace", "Sriranga Patna", "Hyder Ali & Tipu Sultan", false, 20));

		System.out.println("PalaceDTO: not destroyed:- ");
		
		dtos.stream().filter(dto -> !dto.isDestroyed()).collect(Collectors.toList())
				.forEach(e -> System.out.println("\n"+e));
	}

}
