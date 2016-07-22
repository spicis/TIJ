package com.chances.chapter.seven;

public class Music5 {

	static void tune(Instrument5 i){
		i.play();
	}
	
	static void tuneAll(Instrument5[] e){
		for(int i = 0; i < e.length; i++){
			tune(e[i]);
		}
	}
	
	public static void main(String[] args){
		Instrument5[] orchestra = new Instrument5[5];
		int i = 0;
		orchestra[i++] = new Wind5();
		orchestra[i++] = new Percussion5();
		orchestra[i++] = new Stringed5();
		orchestra[i++] = new Brass5();
		orchestra[i++] = new Woodwind5();
		tuneAll(orchestra);
	}
}
