package com.chances.chapter.six;

class Circle extends Shape{

	Circle(int i){
		super(i);
		System.out.println("Drawing a Cricle");
	}
	
	void cleanup(){
		System.out.println("Erasing a Circle");
		super.cleanup();
	}
}
