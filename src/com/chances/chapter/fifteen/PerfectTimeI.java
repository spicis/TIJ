/*
  * Copyright (c) 2016 by Chances.
  * $HeadURL$:
  * $Author$:
  * $Date$:
  * $Rev$:
  */
package com.chances.chapter.fifteen;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Sui Canghai
 * 2016年9月5日
 *
 */
public interface PerfectTimeI extends Remote {

	long getPerfectTime() throws RemoteException;
}
