package com.chances.chapter.twelve;

class FruitQualities {

	private int weight;
	private int color;
	private int firmness;
	private int ripeness;
	private int smell;
	
	FruitQualities() {
		
	}
	
	FruitQualities(FruitQualities f) {
		weight = f.weight;
		color = f.color;
		firmness = f.firmness;
		ripeness = f.ripeness;
		smell = f.smell;
	}
}
