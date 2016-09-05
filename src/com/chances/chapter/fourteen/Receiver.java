/*
  * Copyright (c) 2016 by Chances.
  * $HeadURL$:
  * $Author$:
  * $Date$:
  * $Rev$:
  */
package com.chances.chapter.fourteen;

import java.awt.Container;
import java.io.IOException;
import java.io.Reader;

/**
 * @author Sui Canghai
 * 2016年9月5日
 *
 */
class Receiver extends Blockable {
	
	private Reader in;
	public Receiver(Container c, Reader in) {
		super(c);
		this.in = in;
	}
	public void run() {
		try {
			while(true) {
				i++;
				state.setText("Receiver read: " + (char)in.read());
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
