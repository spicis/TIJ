package com.chances.chapter.eight;

import java.util.Enumeration;

class PrintData {

	static void print(Enumeration e) {
		while(e.hasMoreElements()) {
			System.out.println(
					e.nextElement().toString());
		}
	}
}
