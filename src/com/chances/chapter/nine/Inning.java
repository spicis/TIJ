package com.chances.chapter.nine;

abstract class Inning {

	Inning() throws BaseballException {
		
	}
	
	void event() throws BaseballException {
		
	}
	
	abstract void atBat() throws Strike, Foul;
	
	void walk() {
		
	}
}
