package com.chances.chapter.ten;

public class Circle extends Shape {

	private static int color = RED;
	public Circle(int xVal, int yVal, int dim) {
		super(xVal, yVal, dim);
	}
	
	@Override
	public void setColor(int newColor) {
		color = newColor;
	}

	@Override
	public int getColor() {
		return color;
	}

}
