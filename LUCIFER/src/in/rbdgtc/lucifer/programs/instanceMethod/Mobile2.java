package in.rbdgtc.lucifer.programs.instanceMethod;

public class Mobile2 {

	public String name;
	public String OS;
	public int RAM;
	public int ROM;
	public int version;

	public long[] mobileNumbers;
	public String[] entertainmentApps;
	public String[] googleApps;
	public String[] educationalApps;
	public String[] bankingApps;
	public String[] musicApps;

	public Mobile2(String name, String OS, int RAM, int ROM, int version, long[] mobileNumbers,
			String[] entertainmentApps, String[] googleApps, String[] educationalApps, String[] bankingApps,
			String[] musicApps) {

		this.name = name;
		this.OS = OS;
		this.RAM = RAM;
		this.ROM = ROM;
		this.version = version;

		this.mobileNumbers = mobileNumbers;
		this.entertainmentApps = entertainmentApps;
		this.googleApps = googleApps;
		this.educationalApps = entertainmentApps;
		this.bankingApps = bankingApps;
		this.musicApps = musicApps;

	}

	public void display() {
		System.out.println("Mobile Name : " + this.name);
		System.out.println("OS : " + this.OS);
		System.out.println("RAM : " + this.RAM);
		System.out.println("ROM : " + this.ROM);
		System.out.println("Version : " + this.version);

		System.out.println(System.lineSeparator() + "======Mobile Numbers======");
		for (int i = 0; i < mobileNumbers.length; i++) {
			long l = mobileNumbers[i];
			System.out.println(l);
		}
		System.out.println(System.lineSeparator() + "======Entertainment Apps======");
		for (int i = 0; i < entertainmentApps.length; i++) {
			String string = entertainmentApps[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "======Google Apps======");
		for (int i = 0; i < googleApps.length; i++) {
			String string = googleApps[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "======Entertainment Apps======");
		for (int i = 0; i < entertainmentApps.length; i++) {
			String string = entertainmentApps[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "======Banking Apps======");
		for (int i = 0; i < bankingApps.length; i++) {
			String string = bankingApps[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "======Music Apps======");
		for (int i = 0; i < musicApps.length; i++) {
			String string = musicApps[i];
			System.out.println(string);
		}

	}
}
