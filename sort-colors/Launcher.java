
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution sol = new Solution();
		int[] a = new int[]{0,2,1,2,0,1,0,2,1,0};
		
		sol.sortColors(a);
		for (int index =0 ; index < a.length; index++)
			System.out.print(a[index]);
		
	}

}
