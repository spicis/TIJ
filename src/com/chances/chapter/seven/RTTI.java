package com.chances.chapter.seven;

public class RTTI {

	public static void main(String[] args) {
		Useful[] x = {
				new Useful(),
				new MoreUseful()
		};
		x[0].f();
		x[1].g();
		((MoreUseful)x[1]).u();
		((MoreUseful)x[0]).u();
	}
}
