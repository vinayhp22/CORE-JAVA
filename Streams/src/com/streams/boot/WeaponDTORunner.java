package com.streams.boot;

import java.time.Year;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.streams.constants.WeaponType;
import com.streams.dto.WeaponDTO;

public class WeaponDTORunner {

	public static void main(String[] args) {

		WeaponDTO dto = new WeaponDTO("AntiAirCraft Gun", "India", Year.of(2000), 10000D, WeaponType.PISTOL);
		WeaponDTO dto1 = new WeaponDTO("Antitank weapon", "germany", Year.of(1999), 100000D, WeaponType.RIFLE);
		WeaponDTO dto2 = new WeaponDTO("Cannon", "USA", Year.of(2010), 200000D, WeaponType.RIFLE);
		WeaponDTO dto3 = new WeaponDTO("Mortar", "french", Year.of(2020), 30000D, WeaponType.SUBMACHINE_GUN);
		WeaponDTO dto4 = new WeaponDTO("Schwarzlose machine gun", "Israil", Year.of(1999), 500000D,
				WeaponType.SUBMACHINE_GUN);
		WeaponDTO dto5 = new WeaponDTO("Paris Gun", "French", Year.of(2022), 631000D, WeaponType.PISTOL);
		WeaponDTO dto6 = new WeaponDTO("Glock Gun", "Austria", Year.of(1998), 10000D, WeaponType.PISTOL);
		WeaponDTO dto7 = new WeaponDTO("12 Bore Page", "India", Year.of(2005), 10090D, WeaponType.RIFLE);
		WeaponDTO dto8 = new WeaponDTO("Doddamma KGF", "Russia", Year.of(2021), 200000D, WeaponType.RIFLE);
		WeaponDTO dto9 = new WeaponDTO("SAF Carbine 2A1", "french", Year.of(2020), 30000D, WeaponType.SUBMACHINE_GUN);
		WeaponDTO dto10 = new WeaponDTO("1B1 INSAS", "India & UK", Year.of(2016), 500000D, WeaponType.RIFLE);
		WeaponDTO dto11 = new WeaponDTO("Beretta Gun", "Italy", Year.of(1999), 63100D, WeaponType.PISTOL);
		WeaponDTO dto12 = new WeaponDTO("AK 203", "India & Russia", Year.of(1999), 200000D, WeaponType.RIFLE);
		WeaponDTO dto13 = new WeaponDTO("M4 Carbine", "USA", Year.of(1996), 30000D, WeaponType.CARBINE);
		WeaponDTO dto14 = new WeaponDTO("Heckler & Koch PSG1", "Israil", Year.of(1960), 5001000D, WeaponType.RIFLE);
		WeaponDTO dto15 = new WeaponDTO("Vidhwansak", "India", Year.of(2022), 631000D, WeaponType.RIFLE);
		WeaponDTO dto16 = new WeaponDTO("MK 48 Machine Gun", "Belgium & USA", Year.of(2000), 10000D,
				WeaponType.MACHINE_GUN);
		WeaponDTO dto17 = new WeaponDTO("MG 2A1", "India & Belgium", Year.of(2000), 50000D, WeaponType.MACHINE_GUN);
		WeaponDTO dto18 = new WeaponDTO("ASMI", "India", Year.of(2010), 1000000D, WeaponType.SUBMACHINE_GUN);
		WeaponDTO dto19 = new WeaponDTO("MSMC", "India", Year.of(2000), 3000000D, WeaponType.SUBMACHINE_GUN);

		Collection<WeaponDTO> dtos = Stream.of(dto, dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10, dto11,
				dto12, dto13, dto14, dto15, dto16, dto17, dto18, dto19).collect(Collectors.toList());

		System.out.println("\n1. Price greater than 10000=========");
		dtos.stream().filter(e -> e.getPrice() > 10000D).sorted((a1, a2) -> a1.getPrice().compareTo(a2.getPrice()))
				.collect(Collectors.toList()).forEach(e -> System.out.println(e));

		System.out.println("\n2. Made By & Made On=========");
		dtos.stream().forEach(e -> {
			System.out.println("Made By: " + e.getMadeBy());
			System.out.println("Made On: " + e.getMadeOn());
		});

		System.out.println("\n3. Sort by Name in desc =========");
		dtos.stream().sorted().forEach(e -> System.out.println(e));

		System.out.println("\n4. Sort by Made by =========");
		dtos.stream().sorted((a1, a2) -> a1.getMadeBy().compareTo(a2.getMadeBy())).forEach(e -> System.out.println(e));

		System.out.println("\n5. Sort by Made On =========");
		Comparator<WeaponDTO> comparator = (a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn());
		dtos.stream().sorted(comparator).forEach(e -> System.out.println(e));

		System.out.println("\n6. Sort by Price in asc =========");
		dtos.stream().sorted((a1, a2) -> a1.getPrice().compareTo(a2.getPrice())).forEach(e -> System.out.println(e));

		System.out.println("\n7. Sort by Price in dsc =========");
		dtos.stream().sorted((a1, a2) -> a2.getPrice().compareTo(a1.getPrice())).forEach(e -> System.out.println(e));

		System.out.println("\n6. Sort by name & made on in asc =========");
		dtos.stream().sorted().sorted((a1, a2) -> a2.getMadeOn().compareTo(a1.getMadeOn()))
				.forEach(e -> System.out.println(e));

		System.out.println("\n new  for practice");
		Collection<String> strings = Stream.of("Vinay", "Prashant", "Vinoda", "Shubham", "abhi")
				.collect(Collectors.toList());
		strings.stream().sorted((a1, a2) -> a2.compareToIgnoreCase(a1)).forEach(e -> System.out.println(e));
	}

}
