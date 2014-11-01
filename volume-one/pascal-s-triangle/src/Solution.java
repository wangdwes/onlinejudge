import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> triangle = new ArrayList<List<Integer>>();
    	
    	for (int row = 0; row < numRows; row++) {
    		
    		ArrayList<Integer> currentRow = new ArrayList<Integer>(row);
    		for (int column = 0; column <= row; column++)
    			if (column == 0 || column == row) currentRow.add(1);
    			else currentRow.add(triangle.get(row - 1).get(column) + triangle.get(row - 1).get(column - 1));
    			
    		triangle.add(currentRow);
    		
    	}
    	
    	return triangle;
    }
} 