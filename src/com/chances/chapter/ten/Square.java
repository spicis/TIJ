package com.chances.chapter.ten;

public class Square extends Shape {

	private static int color;
	public Square(int xVal, int yVal, int dim) {
		super(xVal, yVal, dim);
		color = RED;
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
