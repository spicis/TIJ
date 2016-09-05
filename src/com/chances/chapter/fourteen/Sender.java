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
import java.io.Writer;

/**
 * @author Sui Canghai
 * 2016年9月5日
 *
 */
class Sender extends Blockable{
	
	private Writer out;
	public Sender(Container c, Writer out) {
		super(c);
		this.out = out;
	}
	
	public void run() {
		while(true) {
			for(char c = 'A'; c <= 'z'; c++) {
				try {
					i++;
					out.write(c);
					state.setText("Sender sent: " + (char)c);
					sleep((int)(3000 * Math.random()));
				} catch(InterruptedException e) {
					
				} catch(IOException e) {
					
				}
			}
		}
	}
}
