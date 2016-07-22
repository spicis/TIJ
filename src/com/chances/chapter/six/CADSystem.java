package com.chances.chapter.six;

public class CADSystem extends Shape {

	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[10];
	CADSystem(int i){
		super(i + 1);
		for(int j = 0; j < 10; j++){
			lines[j] = new Line(j, j*j);
			c = new Circle(1);
			t = new Triangle(1);
			System.out.println("Combined constructor");
		}
	}
	
	void cleanup(){
		System.out.println("CADSystem.cleanup()");
		t.cleanup();
		c.cleanup();
		for(int i = 0; i < lines.length; i++){
			lines[i].cleanup();
			super.cleanup();
		}
	}
	
	public static void main(String[] args){
		CADSystem x = new CADSystem(47);
		try{
			
		}
		finally{
			x.cleanup();
		}
	}
}
