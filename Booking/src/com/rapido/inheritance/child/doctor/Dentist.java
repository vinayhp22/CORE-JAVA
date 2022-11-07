package com.rapido.inheritance.child.doctor;

import com.rapido.inheritance.custom.Doctor;

public class Dentist extends Doctor {
	// child,subclass,derived
	// Doctor - parent,super,base

	public double fee = 500;
	public int experiance = 6;

	
	public Dentist() {
		System.out.println("Default const of Dentist...");
	}

}
