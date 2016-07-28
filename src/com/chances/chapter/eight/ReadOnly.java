package com.chances.chapter.eight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class ReadOnly {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		Collection1.fill(c);
		c = Collections.unmodifiableCollection(c);
		Collection1.print(c);
		
		List a = new ArrayList();
		Collection1.fill(a);
		a = Collections.unmodifiableList(a);
		ListIterator lit = a.listIterator();
		System.out.println(lit.next());
		
		Set s = new HashSet();
		Collection1.fill(s);
		s = Collections.unmodifiableSet(s);
		Collection1.print(s);
		
		Map m = new HashMap();
		Map1.fill(m, Map1.testData1);
		m = Collections.unmodifiableMap(m);
		Map1.print(m);
		
	}
}
