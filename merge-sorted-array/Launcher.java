
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[]{0,2,0,0,0,0,0,0,0,0};
		int[] b = new int[]{0,1};
		
		Solution sol = new Solution();
		sol.merge(a, 2, b, 2);
		
		for (int index = 0; index < a.length; index++)
			System.out.println(a[index]);
		
	}

}
