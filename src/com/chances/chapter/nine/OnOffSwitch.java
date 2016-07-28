package com.chances.chapter.nine;

public class OnOffSwitch {

	static Switch sw = new Switch();
	public static void main(String[] args) {
		try {
			sw.on();
			sw.off();
		} catch(NullPointerException e) {
			System.out.println("NullPointerException");
		} catch(IllegalArgumentException e) {
			System.out.println("IOException");
			sw.off();
		}
		
	}
}
