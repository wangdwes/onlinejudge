
public class Solution {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length < 2) return 0;
		// don't bother to find the solution if there is insufficient data.
		
		int maxProfitSecond[] = new int[prices.length];	// maximum profit achievable via one transaction before a specific day. 
		int maxProfitFirst[] = new int[prices.length];	// maximum profit achievable via one transaction after a specific day.
		int maxPriceSecond = prices[prices.length - 1];
		int minPriceFirst = prices[0]; 
		
		maxProfitFirst[0] = 0;
		for (int index = 1; index < prices.length; index++) {
			if (minPriceFirst > prices[index]) minPriceFirst = prices[index];
			maxProfitFirst[index] = Math.max(maxProfitFirst[index - 1], prices[index] - minPriceFirst); }
		
		maxProfitSecond[prices.length - 1] = 0;
		for (int index = prices.length - 2; index >= 0; index--) {
			if (maxPriceSecond < prices[index]) maxPriceSecond = prices[index];
			maxProfitSecond[index] = Math.max(maxProfitSecond[index + 1], maxPriceSecond - prices[index]); }
		
		// you can actually buy and sell on the same day. 
		// practically in which case only one transaction is required to achieve maximum profit. 
		
		int maximumProfit = 0;
		for (int index = 0; index < prices.length; index++)
			maximumProfit = Math.max(maximumProfit, maxProfitFirst[index] + maxProfitSecond[index]);
		
		return maximumProfit;
		
	}
}