package com.chances.chapter.seven;

public class Adventure {

	static void t(CanFight x){
		x.fight();
	}
	
	static void u(CanSwim x){
		x.swim();
	}
	
	static void v(CanFly x){
		x.fly();
	}
	
	static void w(ActionCharacter x){
		x.fight();
	}
	
	public static void main(String args[]){
		Hero i = new Hero();
		t(i);
		u(i);
		v(i);
		w(i);
	}
}
