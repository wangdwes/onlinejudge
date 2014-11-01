import java.util.List;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution sol = new Solution();
		List<List<Integer>> triangle = sol.generate(5);
		
		for (int index = 0; index < triangle.size(); index++) {
			System.out.println(triangle.get(index).toString());
		}
	}

}
