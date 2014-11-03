

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution sol = new Solution();

		int[][] m = sol.generateMatrix(4);
		
		for (int y = 0; y < m.length; y++) {
			for (int x = 0; x < m[y].length; x++) {
				System.out.print(m[y][x]);
				System.out.print(',');
			}	System.out.println(); }
		
	}

}
