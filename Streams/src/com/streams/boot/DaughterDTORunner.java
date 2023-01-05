package com.streams.boot;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.streams.dto.DaughterDTO;

public class DaughterDTORunner {
	public static void main(String[] args) {
		
		DaughterDTO dto = new DaughterDTO("Isha Ambani", 789631489l, 30, false, true);
		DaughterDTO dto2 = new DaughterDTO("Kavya Pichai", 7896314852l, 13, true, true);
		DaughterDTO dto3 = new DaughterDTO("Vivian Jenna Wilson", 9632148526l, 19, true, true);
		Collection<DaughterDTO> collection = Stream.of(dto, dto2, dto3).collect(Collectors.toList());
		
		
		System.out.println("\nSort by name: ===================");
		collection.stream().sorted().forEach(e->System.out.println(e.getName()));
		
		System.out.println("\nSort by mobile: ===================");
		collection.stream().sorted((a1,a2)->a2.getMobile().compareTo(a1.getMobile())).forEach(e->System.out.println(e.getMobile()));

		System.out.println("\nSort by age: ===================");
		collection.stream().sorted((a1,a2)->a2.getAge().compareTo(a1.getAge())).forEach(e->System.out.println(e.getAge()));

		System.out.println("\nSort by single: ===================");
		//Comparator<DaughterDTO> comparator = (a1,a2)->a2.isSingle().compareTo(a1.isSingle());
		collection.stream().sorted((a1,a2)->a2.isSingle().compareTo(a1.isSingle())).forEach(e->System.out.println(e.isSingle()));
		
	}
}
