package com.chances.chapter.six;

public class PlaceSetting extends Custom {

	Spoon sp;
	Fork frk;
	Knife kn;
	DinnerPlate pl;
	
	PlaceSetting(int i) {
		super(i + 1);
		sp = new Spoon(i + 2);
		frk = new Fork(i + 3);
		kn = new Knife(i + 4);
		pl = new DinnerPlate(i + 5);
		System.out.println("PlaceSetting constructor");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		PlaceSetting x= new PlaceSetting(9);
	}

}
