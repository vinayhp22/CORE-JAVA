package com.rapido.inheritance.child.doctor;

import com.rapido.inheritance.custom.Doctor;

public class Cardiologist extends Doctor {

	public double fee = 500;
	public int experiance = 5;

	public Cardiologist() {
		System.out.println("Default const of Cardiologist...");
	}
}
