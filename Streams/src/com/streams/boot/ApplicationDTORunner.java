package com.streams.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.streams.dto.ApplicationDTO;

public class ApplicationDTORunner {

	public static void main(String[] args) {
		Collection<ApplicationDTO> applicationDTOs = new ArrayList<ApplicationDTO>();
		applicationDTOs.add(new ApplicationDTO("Instagram", 256.221, true, "Instagram - Meta", 0));
		applicationDTOs.add(new ApplicationDTO("WhatsApp Messenger", 2.23, true, "WhatsApp LLC - Meta", 0));
		applicationDTOs.add(new ApplicationDTO("GitHub", 1.93, true, "GitHub", 0));
		applicationDTOs.add(new ApplicationDTO("Tinder", 13.23, true, "Tinder", 0));
		applicationDTOs.add(new ApplicationDTO("UMAMG", 2.51, true, "MeitY, GOI", 0));
		applicationDTOs.add(new ApplicationDTO("Chrome", 22.36, true, "Google", 0));
		
		System.out.println("ApplicationDTO : Free install & developed By Google:- \n");
		applicationDTOs.
		stream().
		filter(dto->dto.isfree() && dto.getDevelopedBy()=="Google").
		collect(Collectors.toList()).
		forEach(e->System.out.println(e));
	}

}
