package in.rbdgtc.lucifer.boot.instanceMethod;

import in.rbdgtc.lucifer.programs.instanceMethod.Computer4;

public class Computer4Runner {

	public static void main(String[] args) {

		String[] words = { "a", "b", "c", "d" };
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		String[] specialCharacters = { "~", "!", "@", "#", "$", "%", "^" };
		String[] lockButtons = { "Caps lock", "Number lock" };
		String[] defaultButtons = { "Ctrl", "Fn", "Windows", "Alt" };
		String[] microsoftApplications = { "MS word", "MS Office", "Excel", "Microsoft Teams" };

		Computer4 computer = new Computer4("Inspiron 15 3000", "DELL", 2, 8, 15.6, words, numbers, specialCharacters,
				lockButtons, defaultButtons, microsoftApplications);

		computer.display();

	}

}
