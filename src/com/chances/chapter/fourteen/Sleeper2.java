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
class Sleeper2 extends Blockable {

	public Sleeper2(Container c) {
		super(c);
	}
	public void run() {
		change();
		try {
			sleep(100);
		} catch(InterruptedException e) {
			
		}
	}
	public synchronized void change() {
		i++;
		update();
	}
}
