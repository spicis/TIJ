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
class Blocked extends Thread {

	public synchronized void run() {
		try {
			wait();
		} catch(InterruptedException e) {
			System.out.println("InterruptedException");
		}
		System.out.println("Exiting run()");
	}
}
