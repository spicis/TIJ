/*
  * Copyright (c) 2016 by Chances.
  * $HeadURL$:
  * $Author$:
  * $Date$:
  * $Rev$:
  */
package com.chances.chapter.fourteen;

import java.awt.Container;

/**
 * @author Sui Canghai
 * 2016年8月24日
 *
 */
class Sleeper1 extends Blockable {

	public Sleeper1(Container c) {
		super(c);
	}
	public synchronized void run() {
		while(true) {
			i++;
			update();
			try {
				sleep(1000);
			} catch(InterruptedException e) {
				
			}
		}
	}
}
