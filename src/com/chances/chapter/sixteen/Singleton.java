/*
  * Copyright (c) 2016 by Chances.
  * $HeadURL$:
  * $Author$:
  * $Date$:
  * $Rev$:
  */
package com.chances.chapter.sixteen;

/**
 * @author Sui Canghai
 * 2016年9月5日
 *
 */
final class Singleton {

	private static Singleton s = new Singleton(47);
	private int i;
	private Singleton(int x) {
		i = x;
	}
	public static Singleton getHandle() {
		return s;
	}
	public int getValue() {
		return i;
	}
	public void setValue(int x) {
		i = x;
	}
}
