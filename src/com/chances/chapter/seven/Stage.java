package com.chances.chapter.seven;

class Stage {

	Actor a = new HappyActor();
	void change() {
		a = new SadActor();
	}
	void go() {
		a.act();
	}
}
