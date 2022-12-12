package com.xworkz.crud.repository;

import com.xworkz.crud.exception.SweetSizeExceedException;

public class SweetNameRepositoryImpl implements SweetNameRepository {

	private String[] sweets = new String[10];
	private int sweetIndex=0;
	
	@Override
	public boolean create(String sweetName) {
		System.out.println("Create method in SweetNameRepositoryImpl");
		if(this.sweetIndex>=this.sweets.length) {
			throw new SweetSizeExceedException();
		}
		this.sweets[sweetIndex]=sweetName;
		this.sweetIndex++;
		return false;
	}
	
	@Override
	public int total() {
		System.out.print("Total no. of sweets are : ");
		return this.sweetIndex;
	}
	
	

}
