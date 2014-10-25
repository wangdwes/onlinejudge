import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

	private Map<Integer, List<String>> repository = new HashMap<Integer, List<String>>();
	// in an attempt to save some time. 
	
	public List<String> wordBreak(String s, Set<String> dict) {
		List<String> splits = new ArrayList<String>();
		if (s.length() < 1) { splits.add(""); return splits; }
		if (repository.containsKey(s.length())) return repository.get(s.length());
		
		Iterator<String> dictIterator = dict.iterator();
		while (dictIterator.hasNext()) {
			String diction = dictIterator.next();
			if (diction.length() > 0 && s.startsWith(diction)) {
				if (s.length() == diction.length()) splits.add(diction);
				else { List<String> subSplits = wordBreak(s.substring(diction.length()), dict);
					Iterator<String> subSplitIterator = subSplits.iterator();
					while (subSplitIterator.hasNext())
						splits.add(diction.concat(" ").concat(subSplitIterator.next())); } }
		}
		
		repository.put(s.length(), splits);
		return splits;
	}
}