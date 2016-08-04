package com.chances.chapter.twelve;

class GreenZebra extends Tomato {

	GreenZebra() {
		addQualities(new ZebraQualities());
	}
	GreenZebra(GreenZebra g) {
		super(g);
		addQualities(new ZebraQualities());
	}
	void evaluate() {
		ZebraQualities zq = 
			(ZebraQualities)getQualities();
	}
}
