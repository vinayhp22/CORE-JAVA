package com.capgemini.kantara.boot;

import com.capgemini.kantara.thing1.person.*;

public class PersonRunner {

	public static void main(String[] args) {
		Country country = new Country("IND", 91, "JAYA GANA MANA", "Democratic Govt");
		State state = new State("KA", 8529685296l, "Mysuru state", "Jaya Karnataka");
		City city = new City("Bengaluru", 852996852l, "BBMP", "Metropoliton Corporation");
		Location location = new Location(56, "RajajiNagar main Road", city, state, country);
		Address address = new Address(location);
		Company company = new Company("Bull Shit", "BULL SHIT", address);
		Job job = new Job(859696, "Manager", "5 years", company);
		Email email = new Email("ABC12345", "Abc@123", 8595652696l);
		Person person = new Person();
		person.showOff(email, job);
		
	}

}
