package com.chances.chapter.seven;

class Characteristic {

	String s;
	Characteristic(String c) {
		s = c;
		System.out.println(
				"Creating Characteristic " + s);
	}
	
	protected void finalize() {
		System.out.println(
				"finalizing characteristic "+ s);
	}
}
