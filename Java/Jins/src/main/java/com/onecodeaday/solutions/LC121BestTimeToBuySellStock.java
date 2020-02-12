package com.onecodeaday.solutions;

public class LC121BestTimeToBuySellStock {

	/**
	 * Refer LC#121
	 * @param prices
	 * @return
	 */
public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
                //maxProfit =0;
            } else {
                 maxProfit = Math.max(maxProfit, prices[i]-min);
            }
        }
        
        // for (int i = minIndex+1; i< prices.length; i++) {
        //     maxProfit = Math.max(maxProfit, prices[i]-min);
        // }
        
        return maxProfit;
    }



public static void main(String[] args) {
	LC121BestTimeToBuySellStock a = new LC121BestTimeToBuySellStock();
	int [] prices = {7,1,5,3,6,4};
	System.out.println(a.maxProfit(prices)); // should print 5
}
}
