package com.onecodeaday.solutions;

/**
 * @author jins.george
 *
 *         LC #28
 */
public class LC28StrStr {

	public int strStr(String haystack, String needle) {

		if (needle.isEmpty()) {
			return 0;
		}

		int hLen = haystack.length();
		int nLen = needle.length();
		for (int i = 0; i < hLen - nLen + 1; i++) {
			if (haystack.substring(i, i + nLen).equals(needle)) {
				return i;
			}
		}

		return -1;
	}

	public int strStr1(String haystack, String needle) {

		if (haystack == null || needle == null) {
			throw new IllegalArgumentException();
		}
		if (needle.isEmpty()) {
			return 0;
		}
		if (needle.length() > haystack.length()) {
			return -1;
		}
		char[] haystackArr = haystack.toCharArray();
		int needleLen = needle.length();
		int loc = -1;
		for (int i = 0; i < haystackArr.length; i++) {
			if (haystackArr[i] == needle.charAt(0) && (i + needleLen) <= haystackArr.length) {
				String subStr = haystack.substring(i, i + needleLen);
				System.out.println(subStr);
				if (subStr != null && subStr.equals(needle)) {
					loc = i;
					break;
				}
			}
		}

		return loc;
	}
}
