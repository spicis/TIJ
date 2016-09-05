/*
  * Copyright (c) 2016 by Chances.
  * $HeadURL$:
  * $Author$:
  * $Date$:
  * $Rev$:
  */
package com.chances.chapter.fourteen;

/**
 * @author Sui Canghai
 * 2016年9月5日
 *
 */
public class TestAccess {

	public static void main(String[] args) {
		ThreadGroup
			x = new ThreadGroup("x"),
			y = new ThreadGroup(x, "y"),
			z = new ThreadGroup(y, "z");
		Thread
			one = new TestThread1(x, "one"),
			two = new TestThread2(z, "two");
	}
}
