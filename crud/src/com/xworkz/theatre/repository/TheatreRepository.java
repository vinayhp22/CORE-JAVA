package com.xworkz.theatre.repository;

import com.xworkz.theatre.dto.TheatreDTO;

public interface TheatreRepository {

	boolean open(TheatreDTO dto);
	
}