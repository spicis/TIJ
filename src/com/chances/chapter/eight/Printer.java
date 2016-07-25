package com.chances.chapter.eight;

import java.util.Enumeration;

class Printer {

	static void printAll(Enumeration e) {
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement().toString());
		}
	}
}
