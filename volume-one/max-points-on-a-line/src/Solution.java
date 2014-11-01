import java.util.ArrayList;
import java.util.List;

// A = y1 - y0, B = x0 - x1, C = x1y0 - y1x0.

public class Solution {
	
	public class Line {
		int a, b, c; 			// defining a line with ax + by + c = 0. 
		List<Integer> indices; 	// of the points residing on this line.
		Line() { a = 0; b = 0; c = 0; indices = new ArrayList<Integer>(); }
		Line(int pa, int pb, int pc) { a = pa; b = pb; c = pc; indices = new ArrayList<Integer>(); }
	}
	
	public class StackedPoint {
		int x, y, count;
		StackedPoint() { x = 0; y = 0; count = 0; }
		StackedPoint(int px, int py, int pcount) { x = px; y = py; count = pcount; } }
	
	public int maxPoints(Point[] points) {
		
		if (points.length <= 2)
			return points.length;
		
		List<StackedPoint> stackedPoints = new ArrayList<StackedPoint>();
		// stack points with identical coordinate 
		// to facilitate the upcoming search process. 
		for (int index = 0; index < points.length; index++) {
			boolean stacking = false;
			for (int check = 0; check < stackedPoints.size(); check++)
				if (points[index].x == stackedPoints.get(check).x &&
					points[index].y == stackedPoints.get(check).y) { stackedPoints.get(check).count++; stacking = true; break; }
			if (!stacking) stackedPoints.add(new StackedPoint(points[index].x, points[index].y, 1)); }
		
		if (stackedPoints.size() == 1)
			return stackedPoints.get(0).count;
		
		List<Line> lines = new ArrayList<Line>();
		List<Integer> indices = new ArrayList<Integer>();
		for (int index = 0; index < stackedPoints.size(); index++, indices.clear()) {
			StackedPoint point = stackedPoints.get(index);		
			for (int check = 0; check < lines.size(); check++) {
				Line line = lines.get(check); 
				if (line.a * point.x + line.b * point.y + line.c == 0) {
					indices.addAll(line.indices); line.indices.add(index); } }
			for (int check = 0; check < index; check++) {
				if (indices.contains(check)) continue;
				StackedPoint checkedPoint = stackedPoints.get(check);
				int a = checkedPoint.y - point.y;
				int b = point.x - checkedPoint.x;	
				int c = checkedPoint.x * point.y - checkedPoint.y * point.x;
				Line line = new Line(a, b, c); 
				line.indices.add(index);
				line.indices.add(check);
				lines.add(line); } }	
		
		int maximum = -1;
		for (int index = 0; index < lines.size(); index++) {
			Line line = lines.get(index); int pointsCount = 0;
			for (int iter = 0; iter < line.indices.size(); iter++)
				pointsCount += stackedPoints.get(line.indices.get(iter)).count;
			if (pointsCount > maximum) maximum = pointsCount; }
	
		return maximum;
		
		
	}
	
}	 