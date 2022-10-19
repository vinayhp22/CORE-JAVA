package in.rbdgtc.lucifer.programs.instanceMethod;

public class Computer4 {

	public String name;
	public String brand;
	public int RAM;
	public int ROM;
	public double displaySize;

	public String[] words;
	public int[] numbers;
	public String[] specialCharacters;
	public String[] lockButtons;
	public String[] defaultButtons;
	public String[] microsoftApplications;

	public Computer4(String name, String brand, int RAM, int ROM, double displaySize, String[] words, int[] numbers,
			String[] specialCharacters, String[] lockButtons, String[] defaultButtons, String[] microsoftApplications) {

		this.name = name;
		this.brand = brand;
		this.RAM = RAM;
		this.ROM = ROM;
		this.displaySize = displaySize;

		this.words = words;
		this.numbers = numbers;
		this.specialCharacters = specialCharacters;
		this.lockButtons = lockButtons;
		this.defaultButtons = defaultButtons;
		this.microsoftApplications = microsoftApplications;

	}

	public void display() {
		System.out.println("Computer Name : " + this.name);
		System.out.println("Brand : " + this.brand);
		System.out.println("RAM : " + this.RAM + " TB");
		System.out.println("ROM : " + this.ROM + " GB");
		System.out.println("Display Size : " + this.displaySize + "  inch");

		System.out.println(System.lineSeparator() + "======Words======");
		for (int i = 0; i < words.length; i++) {
			String string = words[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "======Numbers======");
		for (int i = 0; i < numbers.length; i++) {
			int j = numbers[i];
			System.out.println(j);
		}
		System.out.println(System.lineSeparator() + "======Special Characters======");
		for (int i = 0; i < specialCharacters.length; i++) {
			String string = specialCharacters[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "======Lock Buttons======");
		for (int i = 0; i < lockButtons.length; i++) {
			String string = lockButtons[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "======Default Buttons======");
		for (int i = 0; i < defaultButtons.length; i++) {
			String string = defaultButtons[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "======Microsoft Applications======");
		for (int i = 0; i < microsoftApplications.length; i++) {
			String string = microsoftApplications[i];
			System.out.println(string);
		}
	}
}
