package in.rbdgtc.lucifer.boot.instanceMethod;

import in.rbdgtc.lucifer.programs.instanceMethod.Fan11;

public class Fan11Runner {
	public static void main(String[] args) {

		String[] category = { "cieling fan", "table fan" };
		String[] brands = { "crompton", "usha", "orient" };
		String[] seller = { "amazon", "fli[pkart" };
		boolean[] energySaving = { true, false };
		String[] types= {"3 wings fan", "4 wings fan", "5 wings fan"};
		String[] top5Manufaturers= {"Ecoair",  "Alfa", "Wintek", "Ajanta","orient"};

		Fan11 fan = new Fan11(2000, 6, "stainless steel", "orient", 4, category, brands, seller, energySaving, types, top5Manufaturers);

		fan.display();
	}

}
