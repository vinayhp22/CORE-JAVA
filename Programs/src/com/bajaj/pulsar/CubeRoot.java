package com.bajaj.pulsar;

import java.util.Scanner;

public class CubeRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n=sc.nextDouble();
		System.out.println(CbRt(n));
	}

	private static double CbRt(double num) {
		double temp;
		double cbRt = num / 3;
		do {
			temp = cbRt;
			cbRt = (temp + num / temp) / 3;
		} while ((temp - cbRt) != 0);
		return cbRt;
	}
}
