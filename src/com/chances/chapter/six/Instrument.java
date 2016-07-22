package com.chances.chapter.six;

class Instrument {

	public void play(){
		System.out.print("play()");
	}
	static void tune(Instrument i){
		i.play();
	}
}
