package com.chances.chapter.six;

class Triangle extends Shape {

	Triangle(int i){
		super(i);
		System.out.println("Drawing a Triangle");
	}
	
	void cleanup(){
		System.out.println("Erasng a Triangle");
		super.cleanup();
	}
}
