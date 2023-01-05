package com.rapido.inheritance.boot;

import com.rapido.inheritance.child.court.DistrictCourt;
import com.rapido.inheritance.child.court.HighCourt;
import com.rapido.inheritance.child.court.SupremeCourt;
import com.rapido.inheritance.custom.Court;

public class CourtRunner {

	public static void main(String[] args) {
		
		Object obj = new Court();
		Court court = (Court)obj;
		System.out.println(court.name);
		System.out.println(court.type);
		
		System.out.println(System.lineSeparator());
		
		Court court2 = new SupremeCourt(court);
		SupremeCourt sc = (SupremeCourt)court2;
		System.out.println(sc.country);
		System.out.println(sc.establishedYear);
		
		System.out.println(System.lineSeparator());
	
		Court court3 = new HighCourt(sc);
		HighCourt hc = (HighCourt)court3;
		System.out.println(hc.state);
		System.out.println(hc.noOfStatesUnderJurisdiction);
		
		System.out.println(System.lineSeparator());
		
		Court court4 = new DistrictCourt(hc);
		DistrictCourt district= (DistrictCourt)court4;
		System.out.println(district.district);
		System.out.println(district.noOfTaluksUnderJurisdiction);
		
		System.out.println(System.lineSeparator());
	
		

	}

}
