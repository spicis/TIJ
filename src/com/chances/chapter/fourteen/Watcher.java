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
class Watcher extends Thread {

	private Sharing1 p;
	public Watcher(Sharing1 p) {
		this.p = p;
		start();
	}
	
	public void run() {
		while(true) {
			for(int i = 0; i < p.s.length; i++) {
				p.s[i].synchTest();
				try {
					sleep(500);
				} catch(InterruptedException e) {
					
				}
			}
		}
	}
}
