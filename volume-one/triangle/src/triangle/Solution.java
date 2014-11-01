package triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int minimumTotal(List<List<Integer>> triangle) {
		ArrayList<Integer> currentMinimum = new ArrayList<Integer>(triangle.size()); 
		for (int column = 0; column < triangle.size(); column++) currentMinimum.add(0); // -1 for unreachable.
		
		for (int row = 0; row < triangle.size(); row++) {
			List<Integer> currentRow = triangle.get(row);
			for (int column = currentRow.size() - 1; column >= 0; column--) {
				if (row == 0 && column == 0) currentMinimum.set(0, currentRow.get(0));
				else { int proposedMinimum = 0, localMinimum = 0;
					if (column <= row - 1) localMinimum = currentMinimum.get(column) + currentRow.get(column);
					if (column != 0) { proposedMinimum = currentMinimum.get(column - 1) + currentRow.get(column);
						if (column > row - 1) localMinimum = proposedMinimum;
						else if (localMinimum > proposedMinimum) localMinimum = proposedMinimum; }
					currentMinimum.set(column, localMinimum); } } }
		
		int minimumSum = currentMinimum.get(0);
		for (int column = 1; column < triangle.size(); column++)
			if (minimumSum > currentMinimum.get(column)) minimumSum = currentMinimum.get(column);
		
		return minimumSum;
	}
}
 