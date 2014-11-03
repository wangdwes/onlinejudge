import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> threeSum(int[] num) {
		
		List<List<Integer>> triplets = new ArrayList<List<Integer>>();
		
		// Elements in a triplet must be in non-descending order...
		// So actually it makes sense to sort the array first. 
		Arrays.sort(num);
		
		for (int first = 0; first < num.length - 2; first++) {
			if (first > 0 && num[first] == num[first - 1]) continue;
			int second = first + 1, third = num.length - 1;
			while (second < third) { // -4 -1 -1 0 1 2
				int sum = num[first] + num[second] + num[third];
				if (sum == 0) {
					List<Integer> triplet = new ArrayList<Integer>();
					triplet.add(num[first]);
					triplet.add(num[second]);
					triplet.add(num[third]);
					triplets.add(triplet); }
				if (sum <= 0) { second++; while (second < third && num[second] == num[second - 1]) second++; }
				if (sum >= 0) { third--; while (second < third && num[third] == num[third + 1]) third--; }
			}
		}

		return triplets;

	}	
	
}
