package com.ivoyant.interfaces.boot;

import com.ivoyant.interfaces.follower.library.*;
import com.ivoyant.interfaces.governor.LibraryManagement;
import com.ivoyant.interfaces.rules.LibraryRules;

public class LibraryRunner {

	public static void main(String[] args) {

		LibraryRules library = new Reader();
		new LibraryManagement(library).check();
		System.out.println("\n");
		LibraryRules library1 = new Reader2();
		new LibraryManagement(library1).check();
	}
}
