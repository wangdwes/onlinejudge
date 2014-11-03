import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {   	
    	List<Integer> spiral = new ArrayList<Integer>();
    	if (matrix == null) return spiral;
    	if (matrix.length == 0) return spiral;
    	
    	int n = matrix.length, m = matrix[0].length;
    	int state = 0, wall = 0, x = 0, y = 0;
    	
    	while (spiral.size() < m * n) {
    		spiral.add(matrix[y][x]);
    		if (state == 0) {if (x < m - wall - 1) x++; else state = 1; } 
    		if (state == 1) {if (y < n - wall - 1) y++; else state = 2; } 
    		if (state == 2) {if (x > wall) x--; else state = 3; }
    		if (state == 3) {if (y > wall + 1) y--; else { state = 0; wall++; x++; }}
    	}
    	
    	return spiral;
    }
}
