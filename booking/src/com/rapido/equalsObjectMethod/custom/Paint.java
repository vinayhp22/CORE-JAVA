package com.rapido.equalsObjectMethod.custom;

public class Paint {

	private String company;
	private String color;
	private int price;
	private String type; // water proof
	private String paintingStyle; // realism
	private String apllicationType; // interior
	private boolean washable;
	private double quantity;
	private String finish; // glossy
	private String countryOfOrigin;

	public Paint() {
		System.out.println("Default const...");
	}

	public Paint(String company, String color, int price, String type, String paintingStyle, String apllicationType,
			boolean washable, double quantity, String finish, String countryOfOrigin) {
		
		super();
		this.company = company;
		this.color = color;
		this.price = price;
		this.type = type;
		this.paintingStyle = paintingStyle;
		this.apllicationType = apllicationType;
		this.washable = washable;
		this.quantity = quantity;
		this.finish = finish;
		this.countryOfOrigin = countryOfOrigin;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals mathod in paint...");
		if (obj instanceof Paint) {
			System.out.println("Obj is paint, can check the properties..");
			Paint cast = (Paint)obj;
			if (this.company.equals(cast.company) && this.color.equals(cast.color)) {
				System.out.println("Company & color are same..");
				return true;
			}else {
				System.err.println("Company & color are not same");
				return false;
			}
			
			
				
		}else {
			System.err.println("Obj is not paint, can't check the properties..");
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Paint [company=" + company + ", color=" + color + ", price=" + price + ", type=" + type
				+ ", paintingStyle=" + paintingStyle + ", apllicationType=" + apllicationType + ", washable=" + washable
				+ ", quantity=" + quantity + ", finish=" + finish + ", countryOfOrigin=" + countryOfOrigin + "]";
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPaintingStyle() {
		return paintingStyle;
	}

	public void setPaintingStyle(String paintingStyle) {
		this.paintingStyle = paintingStyle;
	}

	public String getApllicationType() {
		return apllicationType;
	}

	public void setApllicationType(String apllicationType) {
		this.apllicationType = apllicationType;
	}

	public boolean isWashable() {
		return washable;
	}

	public void setWashable(boolean washable) {
		this.washable = washable;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

}
