package com.chances.chapter.nine;

class Switch {

	boolean state = false;
	boolean read() {
		return state;
	}
	void on() {
		state = true;
	}
	
	void off() {
		state = false;
	}
}
