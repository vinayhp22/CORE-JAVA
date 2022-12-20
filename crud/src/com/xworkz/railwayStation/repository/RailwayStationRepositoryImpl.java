package com.xworkz.railwayStation.repository;

import com.xworkz.railwayStation.dto.RailwayStationDTO;
import com.xworkz.railwayStation.exceptions.RailwayStationsExceedException;

public class RailwayStationRepositoryImpl implements RailwayStationRepository {

	private RailwayStationDTO[] dtos = new RailwayStationDTO[10];
	private int stationIndex = 0;

	@Override
	public boolean create(RailwayStationDTO dto) {
		System.out.println("\n Running create(RailwayStationDTO dto)...");
		if (this.dtos.length >= stationIndex) {
			System.err.println("Stations exceeded, can't add more than 10 stations");
			throw new RailwayStationsExceedException("Stations exceeded cannot add more than 10 stations...");
		}
		this.dtos[stationIndex]=dto;
		System.out.println("RS created at the index : "+stationIndex);
		return true;
	}

}
