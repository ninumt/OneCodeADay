package com.onecodeaday.solutions;

import java.util.HashMap;
import java.util.Map;

public class Roman2IntegerLC13 {

	public int romanToInt(String s) {
		Map<Character, Integer> dict;

		dict = new HashMap<>();
		dict.put('I', 1);
		dict.put('V', 5);
		dict.put('X', 10);
		dict.put('L', 50);
		dict.put('C', 100);
		dict.put('D', 500);
		dict.put('M', 1000);

		int sum = 0;
		if (s.contains("IV")) {
			sum += -2;
		}
		if (s.contains("IX")) {
			sum += -2;
		}
		if (s.contains("XL")) {
			sum += -20;
		}
		if (s.contains("XC")) {
			sum += -20;
		}
		if (s.contains("CD")) {
			sum += -200;
		}
		if (s.contains("CM")) {
			sum += -200;
		}

		char[] sArr = s.toCharArray();

		for (char c : sArr) {
			sum += dict.get(c);
		}

		return sum;
	}
}
