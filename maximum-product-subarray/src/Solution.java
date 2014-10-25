
public class Solution {
	public int maxProduct(int[] A) {
		
		if (A.length == 1) return A[0];
		// c.f.: https://oj.leetcode.com/discuss/11852/share-c-code-with-dp-o-1-space-o-n-time
		
		int negativeMax = 0, positiveMax = 0, maximum = Integer.MIN_VALUE;
		for (int index = 0; index < A.length; index++) {
			if (A[index] < 0) { int adhoc = negativeMax; negativeMax = positiveMax; positiveMax = adhoc; }
			positiveMax = Math.max(positiveMax * A[index], A[index]);
			negativeMax = Math.min(negativeMax * A[index], A[index]);
			maximum = Math.max(maximum, positiveMax); }
		
		return maximum;
	}
}
