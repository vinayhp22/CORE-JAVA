package com.ivoyant.interfaces.follower;

import com.ivoyant.interfaces.rules.CompanyRules;

public class Company implements CompanyRules {

	@Override
	public int noOfShift() {
		return 3;
	}

	@Override
	public double inTime() {
		return 9.00;
	}

	@Override
	public double outTime() {
		return 20.00;
	}

	@Override
	public double breakTime() {
		return 0.50;
	}

	@Override
	public boolean overTimeDutyAvailable() {
		return true;
	}

}
