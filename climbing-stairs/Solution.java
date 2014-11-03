
public class Solution {

    public int climbStairs(int n) {
    	if (n == 0) return 0;
    	
    	int first = 0, second = 1, exchange;
    	for (int stair = 0; stair < n; stair++) {
    		exchange = first + second;
    		first = second; second = exchange; }
    	return second;
    }
}
