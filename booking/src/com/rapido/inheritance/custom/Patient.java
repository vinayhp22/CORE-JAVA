package com.rapido.inheritance.custom;

import com.rapido.inheritance.child.doctor.*;

public class Patient {

	public void consultDoctor(Doctor doctor) { // ref of doc or subclass.
		System.out.println("Running consultDoctor...");
		System.out.println(doctor.name);
		System.out.println(doctor.specialist);
		System.out.println(doctor.income);
		System.out.println(doctor.gender);
		System.out.println("ending consultDoctor...");

		// casting - converting parent type to subclass type ref.

		Dentist dentist = (Dentist) doctor;
		System.out.println(dentist.fee);
		System.out.println("ending consultDoctor after casting...");
	}
}
