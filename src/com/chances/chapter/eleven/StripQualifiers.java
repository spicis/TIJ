package com.chances.chapter.eleven;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

class StripQualifiers {

	private StreamTokenizer st;
	public StripQualifiers(String qualified) {
		st = new StreamTokenizer(
			new StringReader(qualified));
		st.ordinaryChar(' ');
	}
	
	public String getNext() {
		String s = null;
		try {
			if(st.nextToken() != 
				StreamTokenizer.TT_EOL) {
				switch(st.ttype) {
				case StreamTokenizer.TT_EOL: 
					s = null;
					break;
				case StreamTokenizer.TT_NUMBER:
					s = Double.toString(st.nval);
					break;
				case StreamTokenizer.TT_WORD:
					s = new String(st.sval);
					break;
				default:
					s = String.valueOf((char)st.ttype);
				}
			}
		} catch(IOException e) {
			System.out.println(e);
		}
		return s;
	}
	
	public static String strip(String qualified) {
		StripQualifiers sq = 
			new StripQualifiers(qualified);
		String s = "", si;
		while((si = sq.getNext()) != null) {
			int lastDot = si.lastIndexOf('.');
			if(lastDot != -1) {
				si = si.substring(lastDot + 1);
			}
			s += si;
		}
		return s;
	}
}
