package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceImpl;

public class PizzaRunner {

	public static void main(String[] args) {

		PizzaService pizzaService = new PizzaServiceImpl();
		PizzaDTO dto = new PizzaDTO("Margherita", "Dominos", PizzaSize.SMALL, false, 100, "Tomato sauce", "Veg",
				"Vinay", LocalDateTime.of(2022, 12, 14, 14, 27), "Om sir", LocalDateTime.now());
		pizzaService.ValidateAndSave(dto);
	}

}
