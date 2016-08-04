package com.chances.chapter.twelve;

class Fruit {

	private FruitQualities fq;
	private int seeds;
	private Seed[] s;
	Fruit(FruitQualities q, int seedCount) {
		fq = q;
		seeds = seedCount;
		s = new Seed[seeds];
		for(int i = 0; i < seeds; i++) {
			s[i] = new Seed();
		}
	}
	Fruit(Fruit f) {
		fq = new FruitQualities(f.fq);
		seeds = f.seeds;
		for(int i = 0; i < seeds; i++) {
			s[i] = new Seed(f.s[i]);
		}
	}
	protected void addQualities(FruitQualities q) {
		fq = q;
	}
	protected FruitQualities getQualities() {
		return fq;
	}
}
