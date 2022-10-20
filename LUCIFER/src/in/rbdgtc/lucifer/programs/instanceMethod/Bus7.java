package in.rbdgtc.lucifer.programs.instanceMethod;

public class Bus7 {

	public String busDepo;
	public String deponame;
	public String depoManager;
	public String depoLocation;
	public String pass;
	public int noOfMechanic;

	public String[] busRoot;
	public String[] busColor;
	public String[] busNo;
	public String[] busNameType;
	public String depotLocation[];

	public Bus7(String busDepo, String[] busRoot, String[] busColor, String deponame, String[] busNo,
			String depoManager, String depoLocation, String[] busNameType, String pass, String depotLocation[],
			int noOfMechanic) {
		this.busDepo = busDepo;
		this.depoLocation = depoLocation;
		this.deponame = deponame;
		this.depoManager = depoManager;
		this.pass = pass;
		this.busRoot = busRoot;
		this.noOfMechanic = noOfMechanic;
		this.busColor = busColor;
		this.busNo = busNo;
		this.busNameType = busNameType;
		this.depotLocation = depotLocation;
	}

	public void display() {

		System.out.println("Bus Depo : " + this.busDepo);
		System.out.println("Depo Location : " + this.depoLocation);
		System.out.println("Depo Name : " + this.deponame);
		System.out.println("Depo Manager : " + this.depoManager);
		System.out.println("Pass : " + this.pass);
		System.out.println("No. of Mechanic : " + this.noOfMechanic);

		System.out.println(System.lineSeparator() + "busNo Printing naditha ede ");
		for (int i = 0; i < busNo.length; i++) {
			System.out.println(busNo[i]);
		}

		System.out.println(System.lineSeparator() + "Printing naditha ede ");
		for (int i = 0; i < busColor.length; i++) {
			System.out.println(busColor[i]);
		}

		System.out.println(System.lineSeparator() + "busNameType Printing naditha ede ");
		for (int i = 0; i < busNameType.length; i++) {
			System.out.println(busNameType[i]);
		}

		System.out.println(System.lineSeparator() + "Printing naditha ede ");
		for (int i = 0; i < depotLocation.length; i++) {
			System.out.println(depotLocation[i]);
		}

		System.out.println(System.lineSeparator() + "busRoot Printing naditha ede ");
		for (int i = 0; i < busRoot.length; i++) {
			String string = busRoot[i];
			System.out.println(string);
		}

	}

}
