package com.institute.mech.boot;

import com.institute.mech.instance.*;

public class InstanceRunner {

	public static void main(String[] args) {

		Bus bus1 = new Bus();
		System.out.println("Bus no. : " + bus1.num);
		System.out.println("Bus source : " + bus1.source);
		System.out.println("Bus destination : " + bus1.destination);

		bus1.num = 5;
		bus1.source = "Majestic";
		bus1.destination = "Nelamangala";

		System.out.println("Bus no. : " + bus1.num);
		System.out.println("Bus source : " + bus1.source);
		System.out.println("Bus destination : " + bus1.destination);

		System.out.println("----------------------------------------");

		DistrictCollector district1 = new DistrictCollector();
		System.out.println("DC name : " + district1.name);
		System.out.println("District : " + district1.age);
		System.out.println("DC age : " + district1.district);
		System.out.println("DC batch : " + district1.batchNo);

		district1.name = "Patil Yalagouda Shivanagouda";
		district1.age = 50;
		district1.district = "Tumakuru";
		district1.batchNo = 1990;

		System.out.println("DC name : " + district1.name);
		System.out.println("District : " + district1.age);
		System.out.println("DC age : " + district1.district);
		System.out.println("DC batch : " + district1.batchNo);

		System.out.println("----------------------------------------");

		Chocolate happy = new Chocolate();
		System.out.println("Name : " + happy.name);
		System.out.println("Brand : " + happy.brand);
		System.out.println("Price : " + happy.price);
		System.out.println("Flavour : " + happy.flavour);

		happy.name = "Kitkat";
		happy.brand = "Nestle";
		happy.price = 25;
		happy.flavour = "Desert Delight";

		System.out.println("Name : " + happy.name);
		System.out.println("Brand : " + happy.brand);
		System.out.println("Price : " + happy.price);
		System.out.println("Flavour : " + happy.flavour);

		System.out.println("----------------------------------------");

		Song hadu = new Song();
		System.out.println("Song name : " + hadu.name);
		System.out.println("Song language : " + hadu.language);
		System.out.println("Singer : " + hadu.singerName);
		System.out.println("Lyricist : " + hadu.lyricist);

		hadu.name = "Jagave neenu Gelathiye";
		hadu.language = "KANNADA";
		hadu.singerName = "Sid Sriram";
		hadu.lyricist = "Arjun Janya";

		System.out.println("Song name : " + hadu.name);
		System.out.println("Song language : " + hadu.language);
		System.out.println("Singer : " + hadu.singerName);
		System.out.println("Lyricist : " + hadu.lyricist);

		System.out.println("----------------------------------------");

		Developer myFuture = new Developer();
		System.out.println("Developer name : " + myFuture.name);
		System.out.println("Education : " + myFuture.education);
		System.out.println("Experience : " + myFuture.experience + "years");
		System.out.println(" Salary : Rs. " + myFuture.salary + "  per annum");
		System.out.println("Company Name : " + myFuture.company);

		myFuture.name = "Omkar";
		myFuture.education = "BCA";
		myFuture.experience = 14;
		myFuture.salary = 10000000l;
		myFuture.company = "X-workz";

		System.out.println("Developer name : " + myFuture.name);
		System.out.println("Education : " + myFuture.education);
		System.out.println("Experience : " + myFuture.experience + "years");
		System.out.println(" Salary : Rs. " + myFuture.salary + "  per annum");
		System.out.println("Company Name : " + myFuture.company);

		System.out.println("Main mugitidee... Okay prends... Good night....☺☻♥");
	}
}