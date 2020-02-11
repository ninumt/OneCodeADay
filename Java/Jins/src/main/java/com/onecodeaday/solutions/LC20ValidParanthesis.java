package com.onecodeaday.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC20ValidParanthesis {
	private static Map<Character, Character> CLOSE = new HashMap<>();

	static {
		CLOSE.put(')', '(');
		CLOSE.put('}', '{');
		CLOSE.put(']', '[');

	}

	public boolean isValid1(String s) {
		Stack<Character> stack = new Stack<>();
		int len = s.length(), i = 0;
		if (len % 2 != 0) {
			return false;
		}
		if (len == 0) {
			return true;
		}
		// boolean flag = false;
		while (i < len) {
			Character c = s.charAt(i);

			if (CLOSE.containsKey(c)) {
				if (stack.isEmpty()) {
					return false;
				}
				Character pop = stack.pop();
				if (CLOSE.get(c) != pop) {
					return false;
				}
			} else {
				stack.push(c);
			}
			i++;
		}
		return stack.size() == 0;
	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (CLOSE.containsKey(c)) {
				char pop = stack.size() == 0 ? '#' : stack.pop();
				if (CLOSE.get(c) != pop) {
					return false;
				}
			} else {
				stack.push(c);
			}
		}

		return stack.isEmpty();
	}
}
