package com.chances.chapter.seven;

class Hamster implements Rodent {

	public void name() {
		System.out.println("Hamster");
	}
	
	public static void main(String[] args) {
		Rodent[] r = {
				new Mouse(),
				new Gerbil(),
				new Hamster()
		};
		r[0].name();
		r[1].name();
		r[2].name();
	}
}
