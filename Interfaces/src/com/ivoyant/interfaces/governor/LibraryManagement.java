package com.ivoyant.interfaces.governor;

import com.ivoyant.interfaces.rules.LibraryRules;

public class LibraryManagement {

	private LibraryRules library;
	
	public LibraryManagement(LibraryRules library) {
		this.library=library;
	}
	
	public void check() {
		System.out.println("Running membership & inTime");
		if(library!=null) {
			boolean membership=this.library.membership();
			int inTime=this.library.inTime();
			if(membership && inTime >=9) {
				System.out.println("Library rules are following");
			}else {
				System.out.println("Library rules aren't following");
			}
		}
	}
}

