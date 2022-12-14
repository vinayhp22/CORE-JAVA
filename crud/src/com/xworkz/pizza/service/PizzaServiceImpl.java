package com.xworkz.pizza.service;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;

public class PizzaServiceImpl implements PizzaService {

	private boolean validName, validCompany, validSize, validCheese, validPrice, validFlavour, validType;

	@Override
	public boolean ValidateAndSave(PizzaDTO dto) {
		String name = dto.getName();
		String company = dto.getCompany();
		PizzaSize size = dto.getSize();
		boolean cheese = dto.isCheese();
		double price = dto.getPrice();
		String flavour = dto.getFlavour();
		String type = dto.getType();

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("Valid Name : " + name);
			validName = true;
		} else {
			System.err.println("Invalid Name : " + name);
			validName = false;
		}

		if (company != null && company.length() >= 4 && company.length() <= 20) {
			System.out.println("Valid company : " + company);
			validCompany = true;
		} else {
			System.err.println("Invalid company : " + company);
			validCompany = false;
		}

		if (size != null) {
			System.out.println("Valid size : " + size);
			validSize = true;
		} else {
			System.err.println("Invalid size : " + size);
			validSize = false;
		}
		System.out.println("Chesse : " + cheese);

		if (price >= 50 && price <= 2000) {
			System.out.println("Valid price : " + price);
			validPrice = true;
		} else {
			System.err.println("Invalid price : " + price);
			validPrice = false;
		}

		if (flavour != null && flavour.length() >= 3 && flavour.length() <= 20) {
			System.out.println("Valid flavour : " + flavour);
			validFlavour = true;
		} else {
			System.err.println("Invalid flavour : " + flavour);
			validFlavour = false;
		}

		if (type != null && type == "Veg" || type == "Non-Veg") {
			System.out.println("Valid type : " + type  +"\n");
			validType = true;
		} else {
			System.err.println("Invalid type : " + type +"\n");
			validType = false;
		}

		if (validName == false && validCompany == false && validSize == false && validCheese == false
				&& validPrice == false && validFlavour == false && validType == false) {
			System.out.println("Invalid input, plese provide correct input : " + dto);
			return false;
		}else {
			System.out.println("Valid input, moving to payment : " + dto);
			return true;
		}

		
	}

}
