package com.xworkz.crud.repository;

public interface SweetNameRepository {

	boolean create(String sweetName);
	
	default int total() {
		return 0;
	}
}
