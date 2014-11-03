
public class Solution {
	
    public int[][] generateMatrix(int n) {
    	int[][] matrix = new int[n][n];
    	int state = 0, wall = 0, x = 0, y = 0, count = 1;
    	
    	while (count <= n * n) {
    		matrix[y][x] = count++;
    		if (state == 0) {if (x < n - wall - 1) x++; else state = 1; } 
    		if (state == 1) {if (y < n - wall - 1) y++; else state = 2; } 
    		if (state == 2) {if (x > wall) x--; else state = 3; }
    		if (state == 3) {if (y > wall + 1) y--; else { state = 0; wall++; x++; }}
    	}
    	
    	return matrix;
    }
}
