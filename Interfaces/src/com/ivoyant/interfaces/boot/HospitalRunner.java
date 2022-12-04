package com.ivoyant.interfaces.boot;

import com.ivoyant.interfaces.follower.hospital.*;
import com.ivoyant.interfaces.governor.HospitalManagement;
import com.ivoyant.interfaces.rules.HospitalRules;

public class HospitalRunner {

	public static void main(String[] args) {

		HospitalRules hospital = new Doctor();
		HospitalManagement management = new HospitalManagement(hospital);
		management.checking();
		
		System.out.println("\n");
		
		HospitalRules hospital1 = new Patient();
		HospitalManagement management2 = new HospitalManagement(hospital1);
		management2.checking();
		
		System.out.println("\n");
		
		HospitalRules hospital2= new Nurse();
		HospitalManagement management3= new HospitalManagement(hospital2);
		management3.checking();
		
	}

}
