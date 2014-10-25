
public class Solution {

	public int singleNumber(int[] A) {
		int zeros = ~0, ones = 0, twos = 0;
		int prevzeros = 0, prevones = 0, prevtwos = 0; 
		for (int index = 0; index < A.length; index++) {
			prevzeros = zeros; prevones = ones; prevtwos = twos;
			twos = prevtwos & ~(prevtwos & A[index]) | (prevones & A[index]);
			ones = prevones & ~(prevones & A[index]) | (prevzeros & A[index]);
			zeros = prevzeros & ~(prevzeros & A[index]) | (prevtwos & A[index]);  }
		
		return ones; 
		
		/* A potentially faster approach, but less intuitive.  
		
		int ones = 0, twos = 0, threes = 0; // masks;
		for (int index = 0; index < A.length; index++) {
			twos |= ones & A[index];
			ones ^= A[index];
			threes = ones & twos;
			ones &= ~threes;
			twos &= ~threes; }
		
		return ones;

		*/
	}	
}