package com.xworkz.theatre.service;

import com.xworkz.theatre.dto.TheatreDTO;

public interface TheatreService {

	boolean validateAndSave(TheatreDTO dto);
	
}
