package com.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import com.collection.constant.GameType;
import com.collection.dto.GameDTO;

public class GameRumnner {

	public static void main(String[] args) {

		GameDTO dto = new GameDTO("Ball Badminton", GameType.OUTDOOR, 5);
		GameDTO dto2 = new GameDTO("Shuttle Badminton", GameType.INDOOR, 2);
		GameDTO dto3 = new GameDTO("Cricket", GameType.OUTDOOR, 11);
		GameDTO dto4 = new GameDTO("Kabbadi", GameType.INDOOR, 7);
		GameDTO dto5 = new GameDTO("Football", GameType.OUTDOOR, 11);

		Collection<GameDTO> gameDTOs = new ArrayList<GameDTO>();
		gameDTOs.add(dto5);
		gameDTOs.add(dto4);
		gameDTOs.add(dto3);
		gameDTOs.add(dto2);
		gameDTOs.add(dto);

		boolean equals = dto.equals(dto4);
		System.out.println("Equals : " + equals + "\n");
		System.out.println("Equals : " + dto.equals(dto5) + "\n");
		System.out.println("Equals : " + dto.equals(dto3) + "\n");
		System.out.println("Equals : " + dto.equals(dto2) + "\n");
		System.out.println("Equals : " + dto.equals(dto) + "\n");

		boolean contains = gameDTOs.contains(dto5);
		System.out.println("Contains : " + contains + "\n");
		System.out.println("Contains : " + gameDTOs.contains(dto4) + "\n");
		System.out.println("Contains : " + gameDTOs.contains(dto3) + "\n");
		System.out.println("Contains : " + gameDTOs.contains(dto2) + "\n");
		System.out.println("Contains : " + gameDTOs.contains(dto) + "\n");

	}
}
