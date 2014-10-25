
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point points[] = new Point[7];
		
		points[0] = new Point(1, 2);
		points[1] = new Point(1, 2);
		points[2] = new Point(1, 2);
		points[3] = new Point(1, 2);
		points[4] = new Point(1, 2);
		points[5] = new Point(1, 4);
		points[6] = new Point(2, 3);

		
		
		Solution sol = new Solution();
		
		System.out.println(sol.maxPoints(points));		
		
	}

}
