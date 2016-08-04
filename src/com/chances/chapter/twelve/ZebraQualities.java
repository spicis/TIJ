package com.chances.chapter.twelve;

class ZebraQualities extends FruitQualities {

	private int stripedness;
	ZebraQualities() {
		
	}
	ZebraQualities(ZebraQualities z) {
		super(z);
		stripedness = z.stripedness;
	}
}
