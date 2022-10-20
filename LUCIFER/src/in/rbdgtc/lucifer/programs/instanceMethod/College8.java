package in.rbdgtc.lucifer.programs.instanceMethod;

public class College8 {

	static String univercityName = "VTU";
	public String collegeLocation;
	public int noOfColleges;
	public int noOfBranches;
	public String collegePrinciple;

	public String[] branches;
	public String[] collegeNames;
	public String[] places;
	public String[] collageColors;

	public College8(String collegeLocation, String[] collageColors, int noOfColleges, String[] branches,
			int noOfBranches, String[] places, String collegePrinciple, String[] collegeNames) {
		this.collegeLocation = collegeLocation;
		this.noOfColleges = noOfColleges;
		this.noOfBranches = noOfBranches;
		this.collegePrinciple = collegePrinciple;
		this.branches = branches;
		this.collegeNames = collegeNames;
		this.places = places;
		this.collageColors = collageColors;

	}

	public void display() {
		
		System.out.println("Univercity Name : " + univercityName);
		System.out.println("College Location : " + this.collegeLocation);
		System.out.println("No. Of Colleges : " + this.noOfColleges);
		System.out.println("No. Of Branches : " + this.noOfBranches);
		System.out.println("College Principle : " + this.collegePrinciple);

		System.out.println(System.lineSeparator() + "=========Branch=====");
		for (int i = 0; i < branches.length; i++) {
			System.out.println(this.branches[i]);
		}

		System.out.println(System.lineSeparator() + "=========College Names=====");
		for (int i = 0; i < collegeNames.length; i++) {
			System.out.println(this.collegeNames[i]);
		}

		System.out.println(System.lineSeparator() + "=========Places=====");
		for (int i = 0; i < places.length; i++) {
			System.out.println(this.places[i]);

		}

	}

}