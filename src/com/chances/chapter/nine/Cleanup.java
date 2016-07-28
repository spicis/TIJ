package com.chances.chapter.nine;

public class Cleanup {

	public static void main(String[] args) {
		try {
			InputFile in = new InputFile("Cleanup.java");
			String s;
			int i = 1;
			while((s = in.getLine()) != null){
				System.out.println("" + i++ + ": " + s);
				in.cleanup();
			}
		} catch(Exception e) {
			System.out.println("Caught in main, e.printStackTrace()");
			e.printStackTrace();
		}
	}
}
