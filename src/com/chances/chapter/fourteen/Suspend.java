/*
  * Copyright (c) 2016 by Chances.
  * $HeadURL$:
  * $Author$:
  * $Date$:
  * $Rev$:
  */
package com.chances.chapter.fourteen;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Sui Canghai
 * 2016年9月5日
 *
 */
public class Suspend extends Applet {

	private TextField t = new TextField(10);
	private Button
		suspend = new Button("Suspend"),
		resume = new Button("Resume");
	class Suspendable extends Thread {
		private int count = 0;
		private boolean suspended = false;
		public Suspendable() {
			start();
		}
		public void fauxSuspend() {
			suspended = true;
		}
		public synchronized void fauxResume() {
			suspended = false;
			notify();
		}
		public void run() {
			while(true) {
				try {
					sleep(100);
					synchronized(this) {
						while(suspended) {
							wait();
						}
					}
				} catch(InterruptedException e) {
					t.setText(Integer.toString(count++));
				}
			}
		}
	}
	private Suspendable ss = new Suspendable();
	public void init() {
		add(t);
		suspend.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ss.fauxSuspend();
					}
				});
		add(suspend);
		resume.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ss.fauxResume();
					}
				});
		add(resume);
	}
	public static void main(String[] args) {
		Suspend applet = new Suspend();
		Frame aFrame = new Frame("Suspned");
		aFrame.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});
		aFrame.add(applet,  BorderLayout.CENTER);
		aFrame.setSize(300, 100);
		applet.init();
		applet.start();;
		aFrame.setVisible(true);
	}
}
