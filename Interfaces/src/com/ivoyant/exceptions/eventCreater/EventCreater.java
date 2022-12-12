package com.ivoyant.exceptions.eventCreater;

public class EventCreater {

	public static void main(String[] args) {

		System.out.println("method main");
		try {
			System.out.println("try block");
//			Class2 class2 = new Class2();
//			Object obj = (Object)class2;
			String string = null;
			System.out.println(string.length());
//			throw new ClassCastException(); //event created
		} catch (ClassCastException e) {
			System.err.println("ClassCastException");
		} catch (Exception e) {
			System.err.println("Exception");
			try {
				String string = null;
				System.out.println(string.length()); //null-pointer
			} catch (Error e2) {
				System.out.println("Error");
			}
		}
		System.out.println("End");
	}

}
