package com.chances.chapter.eight;

class Mouse {

	private int mouseNumber;
	Mouse(int i) {
		mouseNumber = i;
	}
	
	public String toString() {
		return "this is Mouse #" + mouseNumber;
	}
	
	void print(String msg) {
		if(msg != null) {
			System.out.println(msg);
		}
		System.out.println("Mouse number" + mouseNumber);
	}
}
