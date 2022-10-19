package in.rbdgtc.lucifer.boot.instanceMethod;

import in.rbdgtc.lucifer.programs.instanceMethod.Bus7;

public class Bus7Runner {

	public static void main(String[] args) {
		String[] busColor = { "Red", "Blue", "Yellow", "Green", "white" };
		String[] busNo = { "KA 16 F0143", "KA 16 F1508", "KA 10 T 1569", "KA 17 F 6986", "KA 11 T 1587",
				"KA 01 F 0421" };
		String[] busNameType = { "KSRTC", "BMTC", "NWSRTC", "WESRTC" };
		String depotLocation[] = { "hosadurga", "chamarajanagar", "mysore", "chotradurga", "davanagere" };
		String[] busRoot = { "banglore", "Shivamogga", "dharmastala", "beluru", "Chitradurga" };

		Bus7 bus = new Bus7("Chitradurga", busColor, busRoot, "Hosadurga", busNo, "nagesh", "HosadurgaDepo",
				busNameType, "Student Pass", depotLocation, 40);
		
		bus.display();
	}

}
