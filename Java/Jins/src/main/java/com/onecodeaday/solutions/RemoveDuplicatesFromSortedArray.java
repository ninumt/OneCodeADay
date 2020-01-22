package com.onecodeaday.solutions;

/**
 * LeetCode #26
 * 
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Given nums = [0,0,1,1,1,2,2,3,3,4],  Execution 

i=0, j=1
nums = [0,0,1,1,1,2,2,3,3,4]

i=1, j=2 ( i++)
nums = [0,1,1,1,1,2,2,3,3,4]

i=1, j=3
nums = [0,1,1,1,1,2,2,3,3,4]

i=1, j=4
nums = [0,1,1,1,1,2,2,3,3,4]

i=2, j=5 (i++)
nums = [0,1,2,1,1,2,2,3,3,4]

i=2, j=6
nums = [0,1,2,1,1,2,2,3,3,4]

i=3, j=7 (i++)
nums = [0,1,2,3,1,2,2,3,3,4]

i=3, j=8
nums = [0,1,2,3,1,2,2,3,3,4]

i=4, j=9 (i++)
nums = [0,1,2,3,4,2,2,3,3,4]

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
 */
public class RemoveDuplicatesFromSortedArray {
	
	public static  void main(String[] args) {
		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		printArray(nums, removeDuplicates(nums));
		
	}
	
	private static void printArray(int[] arr, int len) {
		for(int i =0; i< len ; i++) {
			System.out.print("," + arr[i]);
		}
	}
	

	public static int removeDuplicates(int [] nums) {
		if( nums == null || nums.length == 0 ) {
			throw new IllegalArgumentException("input cannot be null/empty");
		}
		
		int i =0;
		for ( int j= 1 ; j< nums.length; j++) {
			if( nums[i] !=  nums[j]) {
				nums[++i] = nums[j];
						
			}
		}
		return i+1;
	}
}
