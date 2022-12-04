package com.ivoyant.interfaces.boot;

import com.ivoyant.interfaces.follower.metro.*;
import com.ivoyant.interfaces.governor.BMRCL;
import com.ivoyant.interfaces.rules.MetroRules;

public class MetroRunner {

	public static void main(String[] args) {

		MetroRules metroRules = new Passengers();
		BMRCL bmrcl= new BMRCL(metroRules);
		bmrcl.check();
		
		System.out.println("\n");
		
		MetroRules metroRules2 = new Driver();
		BMRCL bmrcl2 = new BMRCL(metroRules2);
		bmrcl2.check();
		
		System.out.println("\n");

		MetroRules metroRules3 = new Staff();
		BMRCL bmrcl3 = new BMRCL(metroRules3);
		bmrcl3.check();
	}

}
