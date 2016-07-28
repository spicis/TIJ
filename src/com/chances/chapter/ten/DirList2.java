package com.chances.chapter.ten;

import java.io.File;
import java.io.FilenameFilter;

public class DirList2 {

	public static FilenameFilter filter(final String afn) {
		return new FilenameFilter() {
			String fn = afn;
			public boolean accept(File dir, String n) {
				String f = new File(n).getName();
				return f.indexOf(fn) != -1;
			}
		};
	}
	
	public static void main(String[] args) {
		try {
			File path = new File(".");
			String[] list;
			if(args.length == 0) {
				list = path.list();
			}
			else {
				list = path.list(filter(args[0]));
			}
			for(int i = 0; i < list.length; i++) {
				System.out.println();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
