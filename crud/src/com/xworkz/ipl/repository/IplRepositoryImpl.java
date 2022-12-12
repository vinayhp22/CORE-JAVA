package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.exception.TeamsSizeExceededException;

public class IplRepositoryImpl implements IplRepository {

	private IplDTO[] iplDtos = new IplDTO[10];
	private int currenrIndex = 0;

	@Override
	public boolean create(IplDTO dto) {
		System.out.println("Running create of IplDTO " + dto);
		if(this.currenrIndex>this.iplDtos.length) {
			System.err.println("Size exceeded cannaot add more than 10");
			throw new TeamsSizeExceededException();
		}
		this.iplDtos[this.currenrIndex] = dto;
		this.currenrIndex++;
		
		
		return false;
	}

	

}
