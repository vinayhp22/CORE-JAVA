package com.xworkz.crud.exception;

public class EmailSizeExceededException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public EmailSizeExceededException() {
		System.out.println("EmailSizeExceededException is created");
	}
}
