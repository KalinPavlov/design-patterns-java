package factory;

public class Rectangle implements Shape {
	
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	
	public Rectangle(Point p1, Point p2, Point p3, Point p4) {
		System.out.println("Created rectangle with points: " + p1 + ", " + p2 + ", " + p3 + ", " + p4);
	}
	
	@Override
	public void draw() {
		System.out.println("Rectangle draw()");
	}

	@Override
	public void fillColor() {
		System.out.println("Rectangle fillColor()");
	}

	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

	public Point getP3() {
		return p3;
	}

	public Point getP4() {
		return p4;
	}
}
