package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.exception.TeamsSizeExceededException;

public class IplRepositoryImpl implements IplRepository {

	private IplDTO[] iplDtos = new IplDTO[10];
	// iplDtos={iplDtos[0], iplDtos[1], iplDtos[2], ..., iplDtos[9]}
	private int currentIndex = 0;

	@Override
	public boolean create(IplDTO dto) {
		System.out.println("Running create of IplDTO " +dto +"\n" );
		if(this.currentIndex>=this.iplDtos.length) {
			System.err.println("Size exceeded cannot add more than 10");
			throw new TeamsSizeExceededException();
		}
		this.iplDtos[this.currentIndex] = dto;
		System.out.println(dto+".  At the index of : "+this.currentIndex);
		this.currentIndex++;
		return true;
	}
	
	@Override
	public int total() {
		return currentIndex;
	}
	

}
