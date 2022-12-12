package com.xworkz.crud.repository;

public interface EmailRepository {

	boolean create(String email);

	default int total() {
		return 0;
	}
}
