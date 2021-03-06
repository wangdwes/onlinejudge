import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {

    public int ladderLength(String start, String end, Set<String> dict) {
    	if (start == end) return 0;

    	Set<String> seeds = new HashSet<String>();
    	Set<String> interchange = new HashSet<String>();
    	seeds.add(start); dict.add(end); int iterations = 0; 
    	
    	while (!seeds.isEmpty() && !seeds.contains(end)) {
    		interchange.clear();
    		
    		Iterator<String> seedIterator = seeds.iterator();
    		while (seedIterator.hasNext()) {
    			String seed = seedIterator.next();
    			for (int pos = 0; pos < seed.length(); pos++)
    				for (char alt = 'a'; alt <= 'z'; alt++) { // better than iterating through the dictionary entirely. 
    					String assembly = seed.substring(0, pos) + alt + seed.substring(pos + 1);
    					if (dict.contains(assembly)) {
    						dict.remove(assembly);
    						interchange.add(assembly); } }
    			seedIterator.remove();
    		}
 
    		seeds.addAll(interchange); 
    		iterations++;
    	}

    	if (seeds.contains(end)) return iterations + 1;
    	else return 0;
    }

}
