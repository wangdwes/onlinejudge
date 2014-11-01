import java.util.HashMap;

// https://oj.leetcode.com/discuss/6558/solution-of-mine-o-n-complexity-and-o-n-space-with-single-scan

public class Solution {
	public int longestConsecutive(int[] num) {
		HashMap<Integer, Integer> sequences = new HashMap<Integer, Integer>(); int longest = 0;
		
		for (int index = 0; index < num.length; index++) {
			if (sequences.containsKey(num[index])) continue; // don't toy with me...
			
			int lowerBound = num[index], upperBound = num[index];
			if (sequences.containsKey(num[index] - 1)) lowerBound = sequences.get(num[index] - 1);
			if (sequences.containsKey(num[index] + 1)) upperBound = sequences.get(num[index] + 1);
		
			sequences.put(num[index], num[index]); // old value will be replaced, 
			sequences.put(lowerBound, upperBound); // so don't worry too much about memory usage,
			sequences.put(upperBound, lowerBound); // and the statements' orders cannot be changed arbitrarily.
			
			longest = Math.max(longest, upperBound - lowerBound + 1);
		}
		
		return longest;
	}
}
