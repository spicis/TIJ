package com.chances.chapter.nine;

public class OnOffSwitch2 {

	static Switch2 sw = new Switch2();
	public static void main(String[] args) {
		try {
			sw.on();
		} catch(NullPointerException e) {
			System.out.println("NullPointerException");
		} catch(IllegalArgumentException e) {
			System.out.println("IOException");
		} finally {
			sw.off();
		}
		
	}
}
