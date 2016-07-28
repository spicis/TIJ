package com.chances.chapter.nine;

public class MyException2 extends Exception {

	private int i;
	
	public MyException2() {
		
	}
	public MyException2(String msg) {
		super(msg);
	}
	public MyException2(String msg, int x) {
		super(msg);
		i = x;
	}
	
	public int val() {
		return i;
	}
	
}
