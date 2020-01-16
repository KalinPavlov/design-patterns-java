package abstract_factory;

public class DisplayFriendlyCircle implements DisplayFriendlyShape {
	
	public DisplayFriendlyCircle(Point center, int radius) {
		System.out.println("Created DisplayFriendlyCircle with center = " + center + " radius = " + radius);
	}
	
	@Override
	public void draw() {
		System.out.println("Draw DisplayFriendlyCircle");		
	}

}
