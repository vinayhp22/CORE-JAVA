package com.xworkz.sanitizer.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.sanitizer.constant.Color;
import com.xworkz.sanitizer.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {

		Collection<SanitizerDTO> collection =  new ArrayList<SanitizerDTO>();
		SanitizerDTO dto = new SanitizerDTO("ODC20220822", "Xworkz", 100D, Color.BLUE);
		SanitizerDTO dto1 = new SanitizerDTO("ODC20220815", "Xworkz", 150D, Color.RED);
		SanitizerDTO dto2 = new SanitizerDTO("ODC20220501", "Xworkz", 90D, Color.LIGHT_YELLOW);
		SanitizerDTO dto3 = new SanitizerDTO("ODC20220515", "Xworkz", 50D, Color.BLUE);
		SanitizerDTO dto4 = new SanitizerDTO("ODC20221220", "Xworkz", 160D, Color.WHITE);
		SanitizerDTO dto5 = new SanitizerDTO("ODC20221205", "Xworkz", 60D, Color.BLUE);
		SanitizerDTO dto6 = new SanitizerDTO("ODC20220915", "Xworkz", 110D, Color.BLUE);
		SanitizerDTO dto7 = new SanitizerDTO("ODC20220805", "Xworkz", 50D, Color.WHITE);
		SanitizerDTO dto8 = new SanitizerDTO("ODC20220505", "Xworkz", 250D, Color.LIGHT_YELLOW);
		SanitizerDTO dto9 = new SanitizerDTO("ODC20220620", "Xworkz", 150D, Color.RED);
		
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		
		System.out.println(collection);
		
		
		
	}

}
