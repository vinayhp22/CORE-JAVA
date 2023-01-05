package com.bajaj.pulsar;

public class NoOfDuplicateCharsInAWord {

	public static void main(String[] args) {
		String name = "Sanjay Ssss";
		name = name.toLowerCase();
		char[] nameChar = name.toCharArray();
		int[] count = new int[name.length()];
		for (int i = 0; i < nameChar.length; i++) {
			count[i] = 1;
			for (int j = i + 1; j < nameChar.length; j++) {
				if (nameChar[i] == nameChar[j]) {
					count[i]++;
					nameChar[j] = 0;
				}
			}

		}
		for (int i = 0; i < count.length; i++) {
			if (nameChar[i]!=' ' && nameChar[i]!=0) {
				System.out.println(nameChar[i] + " is " + count[i]);
			}
		}
	}
}
