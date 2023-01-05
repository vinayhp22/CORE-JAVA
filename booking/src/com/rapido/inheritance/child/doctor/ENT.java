package com.rapido.inheritance.child.doctor;

import com.rapido.inheritance.custom.Doctor;

public class ENT extends Doctor {

	public double fee = 1000;
	public int experiance = 8;

	public ENT() {
		System.out.println("Default const of ENT...");
	}
}
