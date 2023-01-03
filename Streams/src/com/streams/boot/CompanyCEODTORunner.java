package com.streams.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.streams.dto.CompanyCEODTO;
import com.streams.dto.DaughterDTO;

public class CompanyCEODTORunner {

	public static void main(String[] args) {

		DaughterDTO dto = new DaughterDTO("Isha Ambani", 789631489l, 30, false, true);
		DaughterDTO dto2 = new DaughterDTO("Kavya Pichai", 7896314852l, 13, true, true);
		DaughterDTO dto3 = new DaughterDTO("Vivian Jenna Wilson", 9632148526l, 19, true, true);
//		DaughterDTO dto4 = new DaughterDTO("Exa Dark Siderael Musk", 0, 1, true, true);
//		Collection<DaughterDTO> daughterDTOs = new ArrayList<DaughterDTO>();
//		daughterDTOs.add(dto3);
//		daughterDTOs.add(dto4);

		Collection<CompanyCEODTO> ceodtos = new ArrayList<CompanyCEODTO>();
		ceodtos.add(new CompanyCEODTO("Natarajan Chadrasekaran", "Tata Sons", 59, "India", "MCA", true, null));
		ceodtos.add(new CompanyCEODTO("Salil Parekh", "Infosys", 58, "India", "BE,MS", true, null));
		ceodtos.add(new CompanyCEODTO("Mukesh Ambani", "Reliance", 65, "India", "BE, MBA(drop-out)", true, dto));
		ceodtos.add(new CompanyCEODTO("Sundar Pichai", "Google", 50, "Indian-American", "BTech, MS, MBA", true, dto2));
		ceodtos.add(new CompanyCEODTO("Elon Mask", "Twitter", 51, "SouthAfrican, Canadian, American", "BA, BS", true,
				dto3));

		System.out.println("CompanyCEODTO : DaughterDTOs........\n");
		ceodtos.stream().map(ceo -> ceo.getDaughter()).collect(Collectors.toList())
				.forEach(e -> System.out.println("\n" + e));

		System.out.println("\n======= CompanyCEODTO : DaughterDTOs - names........\n");
		for (CompanyCEODTO companyCEODTO : ceodtos) {
			if (ceodtos.contains(ceodtos)) {
				ceodtos.stream().map(ceo -> (ceo.getDaughter().getName()!=null)).collect(Collectors.toList())
				.forEach(e -> System.out.println("\n" + e));
			}
		}
	}

}
