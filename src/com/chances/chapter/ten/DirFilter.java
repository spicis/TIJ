package com.chances.chapter.ten;

import java.io.File;
import java.io.FilenameFilter;

public class DirFilter implements FilenameFilter {

	String afn;
	
	DirFilter(String afn) {
		this.afn = afn;
	}
	
	@Override
	public boolean accept(File dir, String name) {
		String f = new File(name).getName();
		return f.indexOf(afn) != -1;
	}

}
