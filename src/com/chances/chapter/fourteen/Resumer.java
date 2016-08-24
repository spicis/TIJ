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
 * 2016年8月24日
 *
 */
class Resumer extends Thread {

	private SuspendResume sr;
	public Resumer(SuspendResume sr) {
		this.sr = sr;
		start();
	}
	public void run() {
		while(true) {
			try {
				sleep(1000);
			} catch(InterruptedException e) {
				sr.resume();
			}
		}
	}
}
