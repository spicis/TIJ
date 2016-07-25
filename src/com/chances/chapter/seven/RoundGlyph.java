package com.chances.chapter.seven;

class RoundGlyph extends Glyph {

	int radius = 1;
	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(),radius = "
		 + radius);
	}
	@Override
	void draw() {
		System.out.println(
				"RoundGlyph.draw(), radius = " + radius);
	}

}
