
public class Solution {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int remainder, accumulative = 0, start = 0, total = 0;
		for (int index = 0; index < gas.length; index++) {
			remainder = gas[index] - cost[index];	
			total += remainder; accumulative += remainder; 
			if (accumulative < 0) { accumulative = 0; start = index + 1; } }

		return total < 0 ? -1: start; 
	}
}
