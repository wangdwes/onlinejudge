
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution sol = new Solution();
		int[] a = new int[]{9};
		
		for (int index = 0; index < a.length; index++) System.out.print(a[index]); System.out.println();
		int[] b = sol.plusOne(a);
		for (int index = 0; index < b.length; index++) System.out.print(b[index]); System.out.println();
	}

}
