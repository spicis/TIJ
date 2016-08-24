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
class SuspendResume2 extends SuspendResume {

	public SuspendResume2(Container c) {
		super(c);
	}
	public void run() {
		while(true) {
			change();
			suspend();
		}
	}
	public synchronized void change() {
		i++;
		update();
	}
	
}
