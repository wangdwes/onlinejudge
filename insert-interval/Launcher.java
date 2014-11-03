import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // [1,2],[3,5],[6,7],[8,10],[12,16]
		
		Interval i1 = new Interval(1,5);
		Interval i2 = new Interval(3,5);
		Interval i3 = new Interval(6,7);
		Interval i4 = new Interval(8,10);
		Interval i5 = new Interval(12,16); 
		Interval ii = new Interval(0,0);
		List<Interval> li = new ArrayList<Interval>();
		li.add(i1); li.add(i2); li.add(i3); li.add(i4); li.add(i5);
		
		Solution sol = new Solution();
		System.out.println(sol.insert(li, ii));
		
		Iterator<Interval> it = li.iterator();
		while (it.hasNext()) {
			Interval itv = it.next();
			System.out.print(itv.start);
			System.out.println(itv.end);
		}
		
	}

}
