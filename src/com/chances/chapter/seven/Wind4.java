package com.chances.chapter.seven;

class Wind4 extends Instrument4 {

	@Override
	public void play() {
		System.out.println("Wind4.play()");
	}

	public String what(){
		return "Wind4";
	}
	
	@Override
	public void adjust() {}

}
