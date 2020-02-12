package com.onecodeaday.solutions;

public class LC66PlusOne {
	public int[] plusOne1(int[] digits) {

		int[] test = new int[10];
		test[0] = 1;
		for (int i : test) {
			System.out.println(i);
		}

		int carry = 0;

		if (digits[digits.length - 1] == 9) {
			carry = 1;
		}

		for (int i = digits.length - 1; i >= 0; i--) {
			if (carry > 0) {
				int sum = digits[i] + carry;
				if (sum < 10) {
					digits[i] = sum;
					carry = 0;
					break;
				} else {
					digits[i] = 0;
					carry = 1;
				}

			} else {
				digits[i] = digits[i] + 1;
				break;
			}
		}

		if (carry == 1) {
			int[] plusOneArr = new int[digits.length + 1];
			plusOneArr[0] = carry;
			for (int i = 1; i < digits.length; i++) {
				plusOneArr[i] = digits[i - 1];
			}
			return plusOneArr;
		} else {
			return digits;
		}

	}

	//final solution
	public int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		int[] digits1 = digits;
		if (digits[0] == 0) {
			digits1 = new int[digits.length + 1];
			digits1[0] = 1;

		}
		return digits1;
	}

}
