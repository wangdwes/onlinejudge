package triangle;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> input = new ArrayList<List<Integer>>();
		List<Integer> row = new ArrayList<Integer>(1); row.add(-1); input.add(row);
		row = new ArrayList<Integer>(2); row.add(3); row.add(2); input.add(row);
		row = new ArrayList<Integer>(3); row.add(1); row.add(-2); row.add(-1); input.add(row);
	//	row = new ArrayList<Integer>(4); row.add(4); row.add(1); row.add(8); row.add(3); input.add(row);
		
		Solution sol = new Solution();
		System.out.println(sol.minimumTotal(input));
	}
}
