package factory;

public class Circle implements Shape {
	
	private Point center;
	private int radius;
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
		System.out.println("Created circle with center = " + center + " radius = " + radius);
	}
	
	@Override
	public void draw() {
		System.out.println("Circle draw()");
	}

	@Override
	public void fillColor() {
		System.out.println("Circle fillColor()");
	}

	public Point getCenter() {
		return center;
	}

	public int getRadius() {
		return radius;
	} 
}
