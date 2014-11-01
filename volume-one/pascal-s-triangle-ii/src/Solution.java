import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> getRow(int rowIndex) {
		ArrayList<Integer> result = new ArrayList<Integer>(rowIndex + 1);
		for (int column = 0; column <= rowIndex; column++) result.add(0);
		
		for (int row = 0; row <= rowIndex; row++)
			for (int column = row; column >= 0; column--)
				if (column == row || column == 0) result.set(column, 1);
				else result.set(column, result.get(column) + result.get(column - 1));
		return result; 
	}
}
