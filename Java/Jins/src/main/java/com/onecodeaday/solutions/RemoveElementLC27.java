package com.onecodeaday.solutions;

public class RemoveElementLC27 {

	// [0,1,2,2,3,0,4,2],
	public int removeElement(int[] nums, int val) {
		if (nums == null) {
			throw new IllegalArgumentException();
		}
		int j = nums.length - 1;
		int i = 0;
		int numCnt = 0;
		while (i <= j) {
			int num = nums[i];
			if (num == val) {
				numCnt++;
				while (i < j) {
					int lVal = nums[j--];
					if (lVal != val) {
						nums[i] = lVal;
						break;
					} else {
						numCnt++;
					}
				}
			}
			i++;
		}
		return nums.length - numCnt;
	}
}
