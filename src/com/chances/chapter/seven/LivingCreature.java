package com.chances.chapter.seven;

class LivingCreature {

	Characteristic p = new Characteristic("is alive");
	LivingCreature() {
		System.out.println("LivingCreature()");
	}
	
	protected void finalize() {
		System.out.println(
				"LivingCreature finalize");
		if(DoBaseFinalization.flag){
			try{
				super.finalize();
			} catch(Throwable t) {
				
			}
		}
	}
}
