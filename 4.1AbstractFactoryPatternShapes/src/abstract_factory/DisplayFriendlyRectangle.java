package abstract_factory;


public class DisplayFriendlyRectangle implements DisplayFriendlyShape {

	public DisplayFriendlyRectangle(Point p1, Point p2, Point p3, Point p4) {
		System.out.println("Created DisplayFriendlyRectangle with points: " + p1 + ", " + p2 + ", " + p3 + ", " + p4);
	}
	
	@Override
	public void draw() {
		System.out.println("DisplayFriendlyRectangle draw()");
	}
	
}
