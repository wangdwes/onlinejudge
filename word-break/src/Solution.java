import java.util.Iterator;
import java.util.Set;

public class Solution {
	public boolean wordBreak(String s, Set<String> dict) {
		if (s.length() < 1) return true;
		
		boolean breakable[] = new boolean[s.length()]; breakable[0] = true;
		// true if the word is breakable up to the specified index position.
		
		for (int index = 0; index < breakable.length; index++) {
			Iterator<String> dictIterator = dict.iterator();
			if (breakable[index])
				while (dictIterator.hasNext()) {
					String diction = dictIterator.next();
					if (s.startsWith(diction, index)) {
						int newSplit = index + diction.length();
						if (newSplit == s.length()) return true; 
						else if (newSplit < s.length()) breakable[newSplit] = true; } } }
		
		return false;
	}
}