package com.xworkz.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.things.Application;
import com.xworkz.spring.things.Area;
import com.xworkz.spring.things.Bus;
import com.xworkz.spring.things.Chocolate;
import com.xworkz.spring.things.City;
import com.xworkz.spring.things.Cycle;
import com.xworkz.spring.things.Fish;
import com.xworkz.spring.things.Girl;
import com.xworkz.spring.things.God;
import com.xworkz.spring.things.Mall;
import com.xworkz.spring.things.Mask;
import com.xworkz.spring.things.Milk;
import com.xworkz.spring.things.Park;
import com.xworkz.spring.things.Patient;
import com.xworkz.spring.things.Road;
import com.xworkz.spring.things.Temple;

public class ThingsRunner {

	@Autowired
	public static void main(String[] args) {
		// Representation of Spring
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Road ref = spring.getBean(Road.class);
		System.out.println(ref + "\n");

		Bus bus = spring.getBean(Bus.class);
		System.out.println(bus + "\n");

		System.out.println(spring.getBean(Cycle.class) + "\n");

		System.out.println(spring.getBean(Girl.class) + "\n");

		System.out.println(spring.getBean(Milk.class) + "\n");

		System.out.println(spring.getBean(Mask.class) + "\n");

		System.out.println(spring.getBean(Patient.class) + "\n");

		System.out.println(spring.getBean(Chocolate.class) + "\n");

		System.out.println(spring.getBean(Area.class) + "\n");
		
		System.out.println(spring.getBean(City.class) + "\n");
		
		System.out.println(spring.getBean(Park.class) + "\n");
	
		System.out.println(spring.getBean(Mall.class) + "\n");
		
		System.out.println(spring.getBean(Fish.class) + "\n");
		
		System.out.println(spring.getBean(Temple.class) + "\n");
		
		System.out.println(spring.getBean(God.class) + "\n");
		
		System.out.println(spring.getBean(Application.class) + "\n");
		
	}

}
