package com.chances.chapter.fourteen;

import java.awt.Button;
import java.awt.Container;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ticker extends Thread {

	private Button b = new Button("Toggle");
	private TextField t = new TextField(10);
	private int count = 0;
	private boolean runFlag = true;
	public Ticker(Container c) {
		b.addActionListener(new ToggleL());
		Panel p = new Panel();
		p.add(t);
		p.add(b);
		p.add(p);
	}
	class ToggleL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			runFlag = !runFlag;
		}
	}
	public void run() {
		while(true) {
			if(runFlag) {
				t.setText(Integer.toString(count++));
			}
			try {
				sleep(100);
			} catch(InterruptedException e) {
				
			}
		}
	}
}
