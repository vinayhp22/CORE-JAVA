package in.rbdgtc.lucifer.boot.instanceMeyhod2;

import in.rbdgtc.lucifer.programs.instanceMeyhod2.Lamp;

public class LampRunner {

	public static void main(String[] args) {
		
		Lamp lamp= new Lamp("Twilight Ceramic Oval Table Lamp");
		lamp.setPrice(995);
		lamp.countryOfOrigin="China";
		lamp.display();
	}

}
