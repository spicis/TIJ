package com.chances.chapter.seven;

public class Music4 {

	static void tune(Instrument4 i){
	
		i.play();
	}
	
	static void tuneAll(Instrument4[] e){
		for(int i = 0; i < e.length; i++)
			tune(e[i]);
	}
	
	public static void main(String[] args){
		Instrument4[] orchestra = new Instrument4[5];
		int i = 0;
		orchestra[i++] = new Wind4();
		orchestra[i++] = new Percussion4();
		orchestra[i++] = new Stringed4();
		orchestra[i++] = new Brass4();
		orchestra[i++] = new Woodwind4();
		tuneAll(orchestra);
	}
}
