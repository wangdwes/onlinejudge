
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
    	int aPointer = 0, bPointer = 0;
    	while (aPointer + bPointer < m + n) {
    		if (bPointer < n && A[aPointer + bPointer] > B[bPointer]) {
    			for (int index = m + n - 1; index >= aPointer + bPointer + 1; index--)
    				A[index] = A[index - 1];
    			A[aPointer + bPointer] = B[bPointer]; bPointer++; }
    		else { if (aPointer < m) aPointer++;
    		else { A[aPointer + bPointer] = B[bPointer]; bPointer++; } }
    	}
    }
}
