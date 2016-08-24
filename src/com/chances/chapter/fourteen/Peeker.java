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
public class Peeker extends Thread {

	private Blockable b;
	private int session;
	private TextField status = new TextField(40);
	private boolean stop = false;
	public Peeker(Blockable b, Container c) {
		c.add(status);
		this.b = b;
		start();
	}
	public void terminate() {
		stop = true;
	}
	public void run() {
		while(!stop) {
			status.setText(b.getClass().getName()
				+ " Peeker " + (++session)
				+ "; value = " + b.read());
			try {
				sleep(100);
			} catch(InterruptedException e) {
				
			}
		}
	}
}
