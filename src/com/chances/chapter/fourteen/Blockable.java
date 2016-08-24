/*
  * Copyright (c) 2016 by Chances.
  * $HeadURL$:
  * $Author$:
  * $Date$:
  * $Rev$:
  */
package com.chances.chapter.fourteen;

import java.awt.Container;
import java.awt.TextField;

/**
 * @author Sui Canghai
 * 2016年8月24日
 *
 */
class Blockable extends Thread {

	private Peeker peeker;
	protected TextField state = new TextField(40);
	protected int i;
	public Blockable(Container c) {
		c.add(state);
		peeker = new Peeker(this, c);
	}
	public synchronized int read() {
		return i;
	}
	protected synchronized void update() {
		state.setText(getClass().getName() 
			+ " state:i = " + i);
	}
	public void stopPeeker() {
		peeker.terminate();
	}
}
