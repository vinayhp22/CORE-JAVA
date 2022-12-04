package com.ivoyant.interfaces.governor;

import com.ivoyant.interfaces.rules.MetroRules;

public class BMRCL {

	private MetroRules metroRules;

	public BMRCL(MetroRules metroRules) {
		super();
		this.metroRules = metroRules;
	}

	public void check() {
		System.out.println("Running MetroRules in BMRCL");
		if (this.metroRules != null) {
			boolean alcoholic = this.metroRules.alcoholic();
			boolean wearMask = this.metroRules.wearMask();
			if (alcoholic==false && wearMask) {
				System.out.println("Metro rules are following");
			} else {
				System.out.println("Metro rules are not following");
			}
		}
	}
}
