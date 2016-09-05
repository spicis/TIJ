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
class TestThread2 extends TestThread1 {

	TestThread2(ThreadGroup g, String name) {
		super(g, name);
		start();
	}
	public void run() {
		ThreadGroup g = 
			getThreadGroup().getParent().getParent();
		g.list();
		Thread[] gAll = new Thread[g.activeCount()];
		g.enumerate(gAll);
		for(int i = 0; i < gAll.length; i++) {
			gAll[i].setPriority(Thread.MIN_PRIORITY);
			((TestThread1)gAll[i]).f();
		}
		g.list();
	}
}
