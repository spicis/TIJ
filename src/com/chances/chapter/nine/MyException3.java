package com.chances.chapter.nine;

public class MyException3 extends Exception {

	MyException3() {
		
	}
	
	MyException3(String s) {
		super(s);
	}
	
	public static void main(String[] args) {
		try {
			throw new MyException3("my exception");
		} catch(MyException3 e) {
			System.out.println(e.getMessage());
		}
	}
}
