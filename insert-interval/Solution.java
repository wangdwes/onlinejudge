import java.util.List;

public class Solution {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    	
    	Interval proposed = new Interval();
    	boolean hosted = false; int insertionIndex = -1;
    	
    	for (int index = 0; index < intervals.size(); index++) {
    		Interval interval = intervals.get(index);
    		proposed.start = Math.min(interval.start, newInterval.start);
    		proposed.end = Math.max(interval.end, newInterval.end);
    		if (interval.start < newInterval.start) insertionIndex = index;
    		if ((proposed.start - proposed.end) >= (interval.start - interval.end) + (newInterval.start - newInterval.end)) {
    			if (!hosted) newInterval = interval; 
    			newInterval.start = proposed.start; newInterval.end = proposed.end;
    			if (hosted) intervals.remove(index--); else hosted = true; }
    	}
    	
    	// nobody wants you! insert yourself into the list. 
    	if (!hosted) intervals.add(insertionIndex + 1, newInterval);
    	
    	return intervals;
    }

	
}
