package com.chances.chapter.seven;

class Amphibian extends Animal {

	Characteristic p = new Characteristic("Can live in water");
	Amphibian() {
		System.out.println("Amphibian()");
	}
	
	protected void finalize() {
		System.out.println("Amphibian finalize");
		if(DoBaseFinalization.flag){
			try {
				super.finalize();
			} catch(Throwable t) {
				
			}
		}
	}
}
