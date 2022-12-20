package com.xworkz.theatre.service;

import com.xworkz.theatre.constant.Brand;
import com.xworkz.theatre.dto.TheatreDTO;
import com.xworkz.theatre.exception.TheatreInvalidDetailsException;
import com.xworkz.theatre.repository.TheatreRepository;

public class TheatreServiceImpl implements TheatreService {

	private boolean validTheatreId, validName, validBrand, validSeats;
	private TheatreRepository repository;
	public TheatreServiceImpl(TheatreRepository repository) {
		this.repository = repository;
	}
	@Override
	public boolean validateAndSave(TheatreDTO dto) {
		System.out.println("Running validateAndSave(TheatreDTO dto)..."+dto);
		Integer theatreId=dto.getTheatreId();
		String name = dto.getName();
		Brand brand = dto.getBrand();
		Integer seats = dto.getSeats();
		
		if(theatreId != 0) {
			System.out.println("Valid theatreId : "+theatreId);
			validTheatreId=true;
		} else {
			System.err.println("Invalid theatreId : "+theatreId);
			validTheatreId=false;
		}
		
		if(name!= null) {
			System.out.println("Valid name: "+name);
			validName=true;
		} else {
			System.err.println("Invalid name: "+name);
			validName=false;
		}
		
		if(brand!= null) {
			System.out.println("Valid brand: "+brand);
			validBrand=true;
		} else {
			System.err.println("Invalid brand: "+brand);
			validBrand=false;
		}
		
		if(seats!= 0) {
			System.out.println("Valid seats: "+seats);
			validSeats=true;
		} else {
			System.err.println("Invalid seats: "+seats);
			validSeats=false;
		}
		if(validTheatreId && validName && validBrand && validSeats) {
			System.out.println("Valid theatre details, you can save using repository"+dto);
			boolean saved = this.repository.open(dto);
			return saved;
		}else {
			System.err.println("In-Valid theatre details, you can not save using repository"+dto);
			throw new TheatreInvalidDetailsException("In-Valid theatre details");
		}

	}

}
