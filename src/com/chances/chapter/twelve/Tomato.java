package com.chances.chapter.twelve;

class Tomato extends Fruit {

	Tomato() {
		super(new FruitQualities(), 100);
	}
	Tomato(Tomato t) {
		super(t);
	}
}
