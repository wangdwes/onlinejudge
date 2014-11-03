import java.util.Arrays;

public class Solution {
	
    public int threeSumClosest(int[] num, int target) {
		
		// Elements in a triplet must be in non-descending order...
		// So actually it makes sense to sort the array first. 
		Arrays.sort(num); int closest = num[0] + num[1] + num[2]; 
		
		for (int first = 0; first < num.length - 2; first++) {
			int second = first + 1, third = num.length - 1;
			while (second < third) { // -1 -1 1 1 3
				int sum = num[first] + num[second] + num[third];
				if (Math.abs(sum - target) < Math.abs(closest - target)) closest = sum; 			
				if (sum > target) third--; else second++;
			}
		}

		return closest;
	}	
	
}
