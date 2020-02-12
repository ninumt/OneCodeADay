package com.onecodeaday.solutions;

import java.util.HashSet;

public class LC202HappyNumber {

	 HashSet<Integer> hash = new HashSet<Integer>();
	    public boolean isHappy(int n) {
	        if(n == 1) {
	            return true;
	        }
	        if ( hash.contains(n)) {
	            return false;
	        }
	        hash.add(n);
	        
	        return isHappy(findSqureSum(n));
	    }
	    
	    private int findSqureSum(int n) {
	        int sum = 0 ;
	        while (n> 0 ) {
	            int digit = n %10;
	            n = n/10;
	            sum+= digit*digit;
	        }
	        return sum;
	    }
}
