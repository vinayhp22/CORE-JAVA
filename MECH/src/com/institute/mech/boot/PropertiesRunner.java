package com.institute.mech.boot;

import com.institute.mech.properties.Tea;

public class PropertiesRunner {

	public static void main(String[] args) {
		Tea tea1 = new Tea();
		System.out.println("Name : " + tea1.name);
		System.out.println("Flavour : " + tea1.flavour);
		System.out.println("Type : " + tea1.type);
		System.out.println("Other Name : " + tea1.otherName);
		System.out.println("Origin : " + tea1.origin + "  years ago");
		System.out.println("Discovered by : " + tea1.discovery);
		System.out.println("Native to : " + tea1.nativeTo);
		System.out.println("Is it Drug :" + tea1.drug);
		System.out.println("Is it healthy : " + tea1.healthy);
		System.out.println("Recent famous flavour : " + tea1.recentAddiction);

		Tea tea = new Tea();
		System.out.println(tea.grownInIndia);
		System.out.println(tea.countryOfOrigin);
		System.out.println(tea.caffein);
		System.out.println(tea.helpToBeHydrated);
		System.out.println(tea.liptonCountry);
		System.out.println(tea.liptonParentCompany);
		System.out.println(tea.liptonOwner);

		tea.grownInIndia = "West Bengal";
		tea.countryOfOrigin = "China";
		tea.caffein = true;
		tea.helpToBeHydrated = true;
		tea.liptonCountry = "UK";
		tea.liptonParentCompany = "Unilever and PepsiCo";
		tea.liptonOwner = "Ekaterra";
		
		tea.competators = "Tata tea";
		System.out.println("===============================================");
		System.out.println(tea.grownInIndia);
		System.out.println(tea.countryOfOrigin);
		System.out.println(tea.caffein);
		System.out.println(tea.helpToBeHydrated);
		System.out.println(tea.liptonCountry);
		System.out.println(tea.liptonParentCompany);
		System.out.println(tea.liptonOwner);
		System.out.println(tea.competators);
	}

}
