package com.ivoyant.interfaces.boot;

import com.ivoyant.interfaces.follower.Company;
import com.ivoyant.interfaces.rules.CompanyRules;

public class CompanyRunner {

	public static void main(String[] args) {

		Company company = new Company();
		System.out.println(company.noOfShift());
		System.out.println(company.inTime());
		System.out.println(company.outTime());
		System.out.println(company.breakTime());
		System.out.println(company.overTimeDutyAvailable());
		
		CompanyRules companyRules = new Company();
		System.out.println(companyRules.noOfShift());
		System.out.println(companyRules.inTime());
		System.out.println(companyRules.outTime());
		System.out.println(companyRules.breakTime());
		System.out.println(companyRules.overTimeDutyAvailable());
		
	}

}
