
public class Solution {
	public int minCut(String s) {
		
		// c.f. https://oj.leetcode.com/discuss/6691/my-dp-solution-explanation-and-code
		
		if (s == null || s.length() == 0) return 0;
		int length = s.length();
		
		int[] cuts = new int[length];
		boolean[][] isPalindrome = new boolean[length][length];
		
		for (int head = length - 1; head >= 0; head--) {
			cuts[head] = length - 1 - head;
			for (int tail = head; tail < length; tail++) {
				if (s.charAt(head) == s.charAt(tail)) {
					if (tail - head <= 2) isPalindrome[head][tail] = true;
					else isPalindrome[head][tail] = isPalindrome[head + 1][tail - 1]; }
				if (isPalindrome[head][tail]) {
					if (tail == length - 1) cuts[head] = 0;
					else cuts[head] = Math.min(cuts[head], cuts[tail + 1] + 1);
				}
			}
		}
		
		return cuts[0];
	}
}
