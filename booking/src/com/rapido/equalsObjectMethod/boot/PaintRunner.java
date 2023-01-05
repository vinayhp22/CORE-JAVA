package com.rapido.equalsObjectMethod.boot;

import com.rapido.equalsObjectMethod.custom.Paint;

public class PaintRunner {

	public static void main(String[] args) {

		Paint paint = new Paint();
		paint.setCompany("Asian Paints");
		paint.setColor("Green");
		paint.setPrice(1500);
		paint.setType("Water Proof");
		paint.setPaintingStyle("Realism");
		paint.setApllicationType("Interior");
		paint.setWashable(true);
		paint.setQuantity(45);
		paint.setFinish("Glossy");
		paint.setCountryOfOrigin("India");

		System.out.println(paint);

		Paint paint2 = new Paint("Asian Paints", "Green", 500, "Emulsion", "Not-realism", "Exterior", false, 565,
				"Not-glossy", "Bangladesh");

		System.out.println(paint2);
		
		boolean same = paint.equals(paint2);
		System.out.println(same);
		
	}

}
