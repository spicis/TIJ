package com.chances.chapter.seven;

class Test{
	public static void main(String[] args){
		Parcel3 p = new Parcel3();
		Contents c = p.cont();
		Destination d = p.dest("Tanzania");
	}
}