package com.chances.chapter.fourteen;

import java.awt.Container;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

class TwoCounter extends Thread {

	private boolean started = false;
	private TextField
		t1 = new TextField(5),
		t2 = new TextField(5);
	private Label l = 
		new Label("count1 == count2");
	private int count1 = 0, count2 = 0;
	public TwoCounter(Container c) {
		Panel p = new Panel();
		p.add(t1);
		p.add(t2);
		p.add(l);
		c.add(p);
	}
	
	public void start() {
		if(!started) {
			started = true;
			super.start();
		}
	}
	
	public void run() {
		while(true) {
			t1.setText(Integer.toString(count1++));
			t2.setText(Integer.toString(count2++));
			try {
				sleep(500);
			} catch(InterruptedException e) {
				
			}
		}
	}
	
	public void synchTest() {
		Sharing1.incrementAccess();
		if(count1 != count2) {
			l.setText("Unsynched");
		}
	}
}
