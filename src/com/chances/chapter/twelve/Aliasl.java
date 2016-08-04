package com.chances.chapter.twelve;

public class Aliasl {

	int i;
	Aliasl(int ii) {
		i = ii;
	}
	
	public static void main(String[] args) {
		Aliasl x = new Aliasl(7);
		Aliasl y = x;
		System.out.println("x: " + x.i);
		System.out.println("y: " + y.i);
		System.out.println("Incrementing x");
		x.i++;
		System.out.println("x: " + x.i);
		System.out.println("y: " + y.i);
	}
}
