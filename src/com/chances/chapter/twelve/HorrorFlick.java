package com.chances.chapter.twelve;

public class HorrorFlick {

	public static void main(String[] args) {
		Person p = new Person();
		Hero h = new Hero();
		Scientist s = new Scientist();
		MadScientist m = new MadScientist();
		
		s = (Scientist)s.clone();
		m = (MadScientist)m.clone();
	}
}
