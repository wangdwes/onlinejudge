
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[]{1,2,3,4,5,6,7};
		
		Solution sol = new Solution();
		TreeNode node = sol.sortedArrayToBST(nums);
		
		System.out.println(node.left.right.val);
		
	}

}
