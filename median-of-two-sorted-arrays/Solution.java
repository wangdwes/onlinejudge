
public class Solution {
	
	// https://oj.leetcode.com/discuss/11174/share-my-iterative-solution-with-o-log-min-n-m
	
    public double findMedianSortedArrays(int A[], int B[]) {
    	int l = A.length, m = B.length; 
    	if (l > m) return findMedianSortedArrays(B, A);
    	
    	int k = (l + m - 1) / 2; 
    	int left = Math.max(0, k - m), right = Math.min(l, k);
    	while (left < right) {
    		int i = (left + right) / 2, j = k - i;
    		if (A[i] < B[j]) left = i + 1; else right = i; }
    	
    	int a = Math.max(left - 1 >= 0? A[left - 1]: Integer.MIN_VALUE, k - left >= 0? B[k - left]: Integer.MIN_VALUE);
    	if ((l + m) % 2 == 1) return (double)a;
    	
    	int b = Math.min(left < l? A[left]: Integer.MAX_VALUE, k - left + 1 < m? B[k - left + 1]: Integer.MAX_VALUE);
    	return (a + b) / 2.0;
    	
    }	
}
