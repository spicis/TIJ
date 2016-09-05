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
class TestThread1 extends Thread {

	private int i;
	TestThread1(ThreadGroup g, String name) {
		super(g, name);
	}
	void f() {
		i++;
		System.out.println(getName() + " f()");
	}
}
