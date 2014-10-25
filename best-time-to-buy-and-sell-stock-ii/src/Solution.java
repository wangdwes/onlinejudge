
public class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length < 2) return 0;
		else if (prices.length == 2) {
			int proposedProfit = prices[1] - prices[0];
			if (proposedProfit > 0) return proposedProfit; else return 0; }

		int profit = 0; boolean hasShare = false; // profit = sum:transaction. 
		for (int index = 1; index < prices.length - 1; index++) {
			int leftDerivative = prices[index] - prices[index - 1];
			int rightDerivative = prices[index + 1] - prices[index];
			
			if (index == 1 && leftDerivative > 0) { profit -= prices[index - 1]; hasShare = true; }
			if (hasShare && (leftDerivative > 0 && rightDerivative <= 0)) { profit += prices[index]; hasShare = false; }
			else if (!hasShare && (leftDerivative <= 0 && rightDerivative > 0)) { profit -= prices[index]; hasShare = true; }
			if (index == prices.length - 2 && hasShare) { profit += prices[index + 1]; hasShare = false; }
		}
		
		return profit;
	}
}
