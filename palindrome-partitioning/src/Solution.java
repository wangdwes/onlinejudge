import java.util.List;

public class Solution {
	
	public List<List<String>> partition(String s) {
		
	}	
	
	public boolean isPalindrome(String s) {
		for (int index = 0; index < s.length() / 2; index++)
			if (s.charAt(index) != s.charAt(s.length() - 1 - index)) return false;
		return true;
	}
}
