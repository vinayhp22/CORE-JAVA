package com.bajaj.pulsar;

public class Fibonacci {
	static int fib(int n) {
		int a = 0, b = 1, c;
		if (n == 0)
			return a;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(b);
		}
		return b;
	}

	public static void main(String args[]) {

		fib(8);
//		System.out.println(fib(n));
	}
}