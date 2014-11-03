import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // [1,2],[3,5],[6,7],[8,10],[12,16]
		
		Interval i1 = new Interval(1,31);
		Interval i2 = new Interval(10,19);
		Interval i3 = new Interval(18,20);
		Interval i4 = new Interval(22,22);
		Interval i5 = new Interval(28,30); 
		List<Interval> li = new ArrayList<Interval>();
		li.add(i1); li.add(i2); li.add(i4); li.add(i3); li.add(i5);
		
		Solution sol = new Solution();
		System.out.println(sol.merge(li));
		
		Iterator<Interval> it = li.iterator();
		while (it.hasNext()) {
			Interval itv = it.next();
			System.out.print(itv.start);
			System.out.println(itv.end);
		}
		
	}

}
