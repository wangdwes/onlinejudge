
public class Solution {
    public int minPathSum(int[][] grid) {
    	if (grid == null) return 0;
    	if (grid.length == 0) return 0;
    	
    	int numOfRows = grid.length, numOfColumns = grid[0].length;
    	int[][] dp = new int[numOfRows + 1][numOfColumns + 1];
    	
    	for (int row = 2; row <= numOfRows; row++) dp[row][0] = Integer.MAX_VALUE;
    	for (int column = 2; column <= numOfColumns; column++) dp[0][column] = Integer.MAX_VALUE;
    	
    	for (int row = 1; row <= numOfRows; row++)
    		for (int column = 1; column <= numOfColumns; column++)
    			dp[row][column] = Math.min(dp[row - 1][column], dp[row][column - 1]) + grid[row - 1][column - 1];
    	
    	return dp[numOfRows][numOfColumns];
    }
}
