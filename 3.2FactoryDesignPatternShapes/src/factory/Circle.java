package factory;

public class Circle implements Shape {
	
	public Circle(Point center, int radius) {
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
}
