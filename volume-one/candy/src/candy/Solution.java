package candy;

public class Solution {
	public int candy(int[] ratings) {
		
		// https://oj.leetcode.com/discuss/76/does-anyone-have-a-better-idea
		
		int sequenceLength = 0, maxNumber = 1;
		int previousNumber = 1, totalNumber = 1; 
		for (int index = 1; index < ratings.length; index++) {
			if (ratings[index] < ratings[index - 1]) {
				sequenceLength++; if (maxNumber == sequenceLength) sequenceLength++; // cheating...
				totalNumber += sequenceLength; previousNumber = 1;
			} else {
				if (ratings[index] > ratings[index - 1]) previousNumber++; else previousNumber = 1;
				totalNumber += previousNumber; 
				sequenceLength = 0; maxNumber = previousNumber; } }
		
		return totalNumber; 
	}
}

	