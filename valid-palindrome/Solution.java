
public class Solution {
	public boolean isPalindrome(String s) {
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		for (int index = 0; index < s.length(); index++)
			if (s.charAt(index) != s.charAt(s.length() - 1 - index)) return false;
		return true;
	}
}
