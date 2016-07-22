package com.chances.chapter.six;

class Line extends Shape {

	private int start, end;
	Line(int start, int end){
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Drawing a Line:" + 
				start + "," + end);
	}
	
	void cleanup(){
		System.out.println("Erasing a Line:" + 
				start + "," + end);
		super.cleanup();
	}
}
