package com.onecodeaday.solutions;

public class LC35SearchInsertPosition {

	public int searchInsert1(int[] nums, int target) {
		
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= target) {
				return i;
			}			
		}

		return nums.length;

	}
	

	public int searchInsert(int[] nums, int target) {
		
		int low = 0, high = nums.length-1;
		
		while(low <= high) {
			int mid = (low+high )/2;
			
			if(nums [mid] == target) {
				return mid;
			} else if( nums [mid] > target) {
				high = mid -1;
			} else {
				low = mid +1 ;
			}
		}
		
		return low;
		
		

	}
	
	public static void main(String [] args) {
		
		LC35SearchInsertPosition search = new LC35SearchInsertPosition();
		
		int [] nums = {1, 3, 5, 6};
		int target = 4;
		
		int pos = search.searchInsert(nums, target);
		
		System.out.println(pos);
	}
}
