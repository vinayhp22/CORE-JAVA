package com.xworkz.railwayStation.services;

import com.xworkz.railwayStation.dto.RailwayStationDTO;
import com.xworkz.railwayStation.exceptions.RailwayStationsInvalidDetailsException;
import com.xworkz.railwayStation.repository.RailwayStationRepository;

public class RailwayStationServiceImpl implements RailwayStationService {

	private boolean validName, validNoOfPlatforms, validArea, validPlatformTicketPrice;
	private RailwayStationRepository repository;

	public RailwayStationServiceImpl(RailwayStationRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(RailwayStationDTO dto) {
		System.out.println("\n Running validateAndSave(RailwayStationDTO dto)");
		String name = dto.getName();
		Integer noOfPlatforms = dto.getNoOfPlatforms();
		String area = dto.getArea();
		Double platformTicketPrice = dto.getPlatformTicketPrice();

		if (name != null && name.length() >= 4 && name.length() <= 18) {
			System.out.println("Valid name : " + name);
			validName = true;
		} else {
			System.out.println("In-Valid name : " + name);
			validName = false;
		}
		if (noOfPlatforms >= 0 && noOfPlatforms <= 10) {
			System.out.println("Valid noOfPlatforms : " + noOfPlatforms);
			validNoOfPlatforms = true;
		} else {
			System.out.println("In-Valid noOfPlatforms : " + noOfPlatforms);
			validNoOfPlatforms = false;
		}
		if (area != null && area.length() >= 4 && area.length() <= 18) {
			System.out.println("Valid area : " + area);
			validArea = true;
		} else {
			System.out.println("In-Valid area : " + area);
			validArea = false;
		}
		if (platformTicketPrice >= 2 && platformTicketPrice <= 50) {
			System.out.println("Valid platformTicketPrice : " + platformTicketPrice);
			validPlatformTicketPrice = true;
		} else {
			System.out.println("In-Valid platformTicketPrice : " + platformTicketPrice);
			validPlatformTicketPrice = false;
		}
		if (validName && validNoOfPlatforms && validArea && validPlatformTicketPrice) {
			System.out.println("Valid Railway Station, you can save using repository" + dto);
			boolean saved=this.repository.create(dto);
			return saved;
		}else {
			System.err.println("In-Valid Railway Station, you can not save using repository" + dto);
			throw new RailwayStationsInvalidDetailsException("In-Valid Railway Station Details..");
		}
		
	}

}
