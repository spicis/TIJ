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
class SuspendResume extends Blockable {

	public SuspendResume(Container c) {
		super(c);
		new Resumer(this);
	}
}
