

public class Solution {
	public String reverseWords(String s) { 
		
		// Use the split function with regular expressions to split the words, 
		// and concatenate them using a string builder. 
		StringBuilder builder = new StringBuilder();
		String[] substrings = " ".concat(s).split(" ++");
		
		// Perhaps there is a better way of doing this?
		for (int index = substrings.length - 1; index > 0; index--) {
			builder.append(substrings[index]);
			if (index != 1) builder.append(" "); }
		
		return builder.toString();
		
	}	
}
