package com.onecodeaday.solutions;

/**
 * Check if a given string has all unique chars. 
 * 
 * @author jins.george
 *
 */
public class StringUnique {

	
	public static boolean isUnique(String s) {
		
		if(s == null) {
			throw new IllegalArgumentException("Argument cannot be null");
		}
		
		boolean[] charSet =  new boolean[128];
		
		for(int i =0; i< s.length(); i++) {
			char c = s.charAt(i);
			if(charSet[c]) {
				return false;
			}
			charSet[c] = true;
		}
		return true;
	}

}
