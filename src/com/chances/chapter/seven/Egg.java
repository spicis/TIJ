package com.chances.chapter.seven;

class Egg {

	protected class Yolk {
		public Yolk() {
			System.out.println("Egg.Yolk()");
		}
	}
	
	private Yolk y;
	
	public Egg() {
		System.out.println("New Egg()");
		y = new Yolk();
	}
}
