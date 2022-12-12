package com.xworkz.crud.repository;

import com.xworkz.crud.exception.EmailSizeExceededException;

public class EmailRepositoryImpl implements EmailRepository {

	private String[] emails = new String[10];
	private int emailIndex = 0;

	@Override
	public boolean create(String email) {
		System.out.println("create method in EmailRepositoryImpl");
		if (this.emailIndex >= this.emails.length) {
			throw new EmailSizeExceededException();
		}
		this.emails[emailIndex] = email;
		this.emailIndex++;
		return false;
	}

	@Override
	public int total() {
		System.out.println("total emails");
		return this.emailIndex;
	}

}
