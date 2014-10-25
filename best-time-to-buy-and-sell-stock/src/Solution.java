
public class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length < 1) return 0; 
		
		int currentMinimum = prices[0], maximumProfit = 0;
		for (int index = 1; index < prices.length; index++) {
			int proposedProfit = prices[index] - currentMinimum;
			if (maximumProfit < proposedProfit) maximumProfit = proposedProfit;
			if (prices[index] < currentMinimum) currentMinimum = prices[index]; }
		
		return maximumProfit;
	}
}
