
public class Solution {

	public int singleNumber(int[] A) {
		int xor = 0;
		for (int index = 0; index < A.length; index++)
			xor ^= A[index]; 
		
		return xor;
	}
}
