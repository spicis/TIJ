package com.chances.chapter.six;

public class FinalData {

	//Can be compile-time constants
	final int i1 = 9;
	static final int I2 = 99;
	//Typical public constant:
	public static final int I3 = 39;
	//Cannot be compile-time constants:
	final int i4 = (int)(Math.random()*20);
	static final int i5 = (int)(Math.random()*20);
	
	Value v1 = new Value();
	final Value v2 = new Value();
	static final Value v3 = new Value();
	
	//Arrays:
	final int[] a = {1, 2, 3, 4, 5, 6};
	
	public void print(String id){
		System.out.println(id + ": " + "i4= " + i4 +
				", i5 = " + i5);
	}
	public static void main(String[] args){
		FinalData fd1 = new FinalData();
		//! fd1.i1++;
		fd1.v2.i++;
		fd1.v1 = new Value();
		for(int i = 0; i < fd1.a.length; i++)
			fd1.a[i]++;
			//! fd1.v2 = new Value();
			//! fd1.v3 = new Value();
			//! f1.a = new int[3];
			
		fd1.print("fd1");
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData();
		fd1.print("fd1");
		fd2.print("fd2");
	}
}
