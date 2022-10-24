package in.rbdgtc.lucifer.boot.instanceMeyhod2;

import in.rbdgtc.lucifer.programs.instanceMeyhod2.ShirtBrand;

public class ShirtBrandERunner {

	public static void main(String[] args) {

		ShirtBrand shirtBrand = new ShirtBrand("Charles V. Bergh");
		shirtBrand.setCustomerCareNumber(18001020501l);
		shirtBrand.headQuarters = " San Francisco, California, United States";
		shirtBrand.display();
	}

}
