package com.xworkz.war.repository;

import java.time.LocalDate;
import com.xworkz.ipl.exception.WarSizeExceededException;
import com.xworkz.war.dto.WarDTO;

public class WarRepositoryImpl implements WarRepository {

	private WarDTO[] dtos = new WarDTO[10];
	private int currentIndex = 0;

	@Override
	public boolean create(WarDTO dto) {
		System.out.println("Running create of WarDTO \n");
		if (this.currentIndex >= this.dtos.length) {
			System.err.println("Size exceeded cannot add more than 10");
			throw new WarSizeExceededException();
		}
		this.dtos[this.currentIndex] = dto;
		System.out.println(dto + ".  At the index of : " + this.currentIndex);
		this.currentIndex++;
		return true;
	}

	@Override
	public boolean create(WarDTO[] dtos) {
		for (WarDTO warDTO : dtos) {
			System.out.println("Running create of WarDTO[i] \n");
			if (this.currentIndex > this.dtos.length) {
				System.err.println("Size exceeded cannot add more than 2");
				throw new WarSizeExceededException();
			}
			this.dtos[this.currentIndex] = warDTO;
			System.out.println(warDTO + ".  At the index of : " + this.currentIndex +"\n");
			this.currentIndex++;
		}
		return true;

	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public WarDTO findByStartedBy(String startedBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate findByStartDateGreaterThanOrEqualTo(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate findByStartDateLesserThanOrEqualTo(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate findByStartDateAndEndDate(LocalDate start, LocalDate end) {
		// TODO Auto-generated method stub
		return null;
	}

}
