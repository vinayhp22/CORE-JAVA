package com.xworkz.sanitizer.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.sanitizer.constant.Color;
import com.xworkz.sanitizer.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {

		Collection<SanitizerDTO> collection = new ArrayList<SanitizerDTO>();
		SanitizerDTO dto = new SanitizerDTO("ODC20220822", "Xworkz", 5D, Color.BLUE);
		SanitizerDTO dto1 = new SanitizerDTO("ODC20220815", "Xworkz", 150D, Color.RED);
		SanitizerDTO dto2 = new SanitizerDTO("ODC20220501", "Xworkz", 90D, Color.LIGHT_YELLOW);
		SanitizerDTO dto3 = new SanitizerDTO("ODC20220515", null, 50D, Color.BLUE);
		SanitizerDTO dto4 = new SanitizerDTO("ODC20221220", "Xworkz", 160D, null);
		SanitizerDTO dto5 = new SanitizerDTO("ODC20221205", "Xworkz", null, Color.BLUE);
		SanitizerDTO dto6 = new SanitizerDTO("ODC20220915", "Xworkz", 110D, Color.BLUE);
		SanitizerDTO dto7 = new SanitizerDTO("ODC20220805", "Xworkz", 50D, Color.WHITE);
		SanitizerDTO dto8 = new SanitizerDTO(null, "Xworkz", 250D, Color.LIGHT_YELLOW);
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

		System.err.println("\n ==== Price less than 5 rupee ==== \n");
		for (SanitizerDTO sanitizerDTO : collection) {
			if (sanitizerDTO.getPrice() != null) {
				System.out.println("sanitizerDTO.getPrice() : " + sanitizerDTO.getPrice());
				if (sanitizerDTO.getPrice() <= 5) {
					System.out.println("Price less than 5 rupee : " + sanitizerDTO.getPrice());
				}
			}
		}

		System.err.println("\n ==== null in any property ==== \n");
		for (SanitizerDTO sanitizerDTO : collection) {
			if (sanitizerDTO.getBrand() == null) {
				System.out.println("Brand is null \n" + sanitizerDTO);
			}
			if (sanitizerDTO.getId() == null) {
				System.out.println("Id is null \n" + sanitizerDTO);
			}
			if (sanitizerDTO.getPrice() == null) {
				System.out.println("Price is null \n" + sanitizerDTO);
			}
			if (sanitizerDTO.getColor() == null) {
				System.out.println("Color is null \n" + sanitizerDTO);
			}
		}

		System.err.println("\n ==== maxPrice ==== \n");
		Double maxPrice = 0D;
		for (SanitizerDTO sanitizerDTO : collection) {
			if (sanitizerDTO.getPrice() != null) {
				System.out.println("sanitizerDTO.getPrice() : " + sanitizerDTO.getPrice());
				if (sanitizerDTO.getPrice() > maxPrice) {
					maxPrice = sanitizerDTO.getPrice();
				}
			}
		}
		System.out.println("maxPrice : " + maxPrice);


		System.err.println("\n ==== leastPrice ==== \n");
		Double leastPrice = maxPrice;
		for (SanitizerDTO sanitizerDTO : collection) {
			if (sanitizerDTO.getPrice() != null) {
				System.out.println("sanitizerDTO.getPrice() : " + sanitizerDTO.getPrice());
				if (sanitizerDTO.getPrice() < leastPrice) {
					leastPrice = sanitizerDTO.getPrice();
				}
			}
		}
		System.out.println("leastPrice : " + leastPrice);


		System.err.println("\n ==== SecMaxPrice ==== \n");
		Double secMaxPrice = 0D;
		for (SanitizerDTO sanitizerDTO : collection) {
			if (sanitizerDTO.getPrice() != null) {
				System.out.println("sanitizerDTO.getPrice() : " + sanitizerDTO.getPrice());
				if (sanitizerDTO.getPrice() > secMaxPrice && sanitizerDTO.getPrice() != maxPrice) {
					secMaxPrice = sanitizerDTO.getPrice();
				}
			}
		}
		System.out.println("secMaxPrice : " + secMaxPrice);


	}

}
