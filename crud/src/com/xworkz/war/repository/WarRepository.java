package com.xworkz.war.repository;

import java.time.LocalDate;

import com.xworkz.war.dto.WarDTO;

public interface WarRepository {

	boolean create(WarDTO dto);
	
	boolean create(WarDTO[] dtos);
	
	int total();
	
	WarDTO findByStartedBy(String startedBy);
	
	WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith);

	LocalDate findByStartDateGreaterThanOrEqualTo(LocalDate date);
	
	LocalDate findByStartDateLesserThanOrEqualTo(LocalDate date);
	
	LocalDate findByStartDateAndEndDate(LocalDate start, LocalDate end);

}
