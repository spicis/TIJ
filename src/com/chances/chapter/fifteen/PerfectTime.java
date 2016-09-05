/*
  * Copyright (c) 2016 by Chances.
  * $HeadURL$:
  * $Author$:
  * $Date$:
  * $Rev$:
  */
package com.chances.chapter.fifteen;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Sui Canghai
 * 2016年9月5日
 *
 */
public class PerfectTime extends UnicastRemoteObject implements PerfectTimeI {

	public long getPerfectTime() throws RemoteException {
		return System.currentTimeMillis();
	}
	
	public PerfectTime() throws RemoteException {
		
	}
	
	public static void main(String[] args) {
		System.setSecurityManager(
			new RMISecurityManager());
		try {
			PerfectTime pt = new PerfectTime();
			Naming.bind("//colossus:2005/PerfectTime", pt);
			System.out.println("Ready to do time");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
