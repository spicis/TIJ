package com.chances.chapter.eight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Synchronization {

	public static void main(String[] args) {
		Collection c = Collections.synchronizedCollection(
				new ArrayList());
		List list = Collections.synchronizedList(
				new ArrayList());
		Set s = Collections.synchronizedSet(
				new HashSet());
		Map m = Collections.synchronizedMap(
				new HashMap());
	}
}
