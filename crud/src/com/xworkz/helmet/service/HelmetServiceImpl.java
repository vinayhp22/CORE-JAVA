package com.xworkz.helmet.service;

import com.xworkz.helmet.constant.Color;
import com.xworkz.helmet.constant.Type;
import com.xworkz.helmet.dto.HelmetDTO;
import com.xworkz.helmet.repository.HelmetRepository;

public class HelmetServiceImpl implements HelmetService {

	private HelmetRepository helmetRepository;
	private boolean validBrand, validPrice, validColor, validType;

	public HelmetServiceImpl(HelmetRepository helmetRepository) {
		this.helmetRepository = helmetRepository;
	}

	@Override
	public boolean validateAndSave(HelmetDTO dto) {
		String brand = dto.getBrand();
		Double price = dto.getPrice();
		Color color = dto.getColor();
		Type type = dto.getType();

		if (brand != null && brand.length() > 2 && brand.length() <= 10) {
			System.out.println("Brand is valid : " + brand);
			validBrand = true;
		} else {
			System.err.println("Brand is Invalid : " + brand);
			validBrand = false;
		}
		if (price != null && price >= 100 && price <= 10000) {
			System.out.println("price is valid : " + price);
			validPrice = true;
		} else {
			System.err.println("price is Invalid : " + price);
			validPrice = false;
		}
		if (color != null) {
			System.out.println("color is valid : " + color);
			validColor = true;
		} else {
			System.err.println("color is Invalid : " + color);
			validColor = false;
		}
		if (type != null) {
			System.out.println("type is valid : " + type);
			validType = true;
		} else {
			System.err.println("type is Invalid : " + type);
			validType = false;
		}

		if (validBrand && validPrice && validColor && validType) {
			System.out.println("HelmetDTO is Valid, can save using repository");
			boolean saved = this.helmetRepository.save(dto);
			return saved;
		} else {
			System.err.println("HelmetDTO is Invalid, cannot save using repository");
			return false;
		}

	}

}
