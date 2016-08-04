package com.chances.chapter.twelve;

public class CopyConstructor {

	public static void ripen(Tomato t) {
		t = new Tomato(t);
		System.out.println("In riped, t is a " + 
			t.getClass().getName());
	}
	public static void slice(Fruit f) {
		f = new Fruit(f);
		System.out.println("In slice, f is a" + 
			f.getClass().getName());
	}
	public static void main(String[] args) {
		Tomato tomato = new Tomato();
		ripen(tomato);
//		slice(tomato);
		GreenZebra g = new GreenZebra();
//		ripen(g);
//		slice(g);
		g.evaluate();
	}
}
