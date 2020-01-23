package com.onecodeaday.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author jins.george
 *
 *         LC #443
 *
 *         Input: ["a","a","a","b","b","c","c","c"]
 * 
 *         Output: Return 6, and the first 6 characters of the input array
 *         should be: ["a","2","b","2","c","3"]
 * 
 *         Explanation: "aa" is replaced by "a2". "bb" is replaced by "b2".
 *         "ccc" is replaced by "c3".
 * 
 */
public class StringCompression {

	public int compress(char[] chars) {
		if (chars.length == 1) {
			return 1;
		}

		int index = 0;
		int res = 0;
		while (index < chars.length) {
			char currChar = chars[index];

			int count = 0;
			while (index < chars.length && chars[index] == currChar) {
				count++;
				index++;
			}

			chars[res++] = currChar;
			if (count > 1) {
				for (char c : String.valueOf(count).toCharArray()) {
					chars[res++] = c;
				}
			}

		}
		return res;

	}

	public static void main(String[] args) {
		StringCompression c = new StringCompression();

		char[] arr = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };

		int count = c.compress(arr);
		for (int i = 0; i < count; i++) {
			System.out.println(arr[i]);
		}

	}
}
