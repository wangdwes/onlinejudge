
public class Solution {
    public int uniquePaths(int m, int n) {
    	// mathematically correct,  but may overflow or be truncated to zero.
    	int number = 1;
    	for (int k = 1; k <= m - 1; k++)
    		number *= (m + n - 2 - (k - 1)) / k;
    	return number;
    }
}
