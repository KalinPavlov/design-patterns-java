package abstract_factory;

public class PrinterFriendlyCircle implements DisplayFriendlyShape {
	
	public PrinterFriendlyCircle(Point center, int radius) {
		System.out.println("Created PrinterFriendlyCircle with center = " + center + " radius = " + radius);
	}
	
	@Override
	public void draw() {
		System.out.println("Draw PrinterFriendlyCircle");		
	}

}
