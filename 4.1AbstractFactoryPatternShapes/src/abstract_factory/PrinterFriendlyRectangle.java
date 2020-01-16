package abstract_factory;
public class PrinterFriendlyRectangle implements DisplayFriendlyShape {
	
	public PrinterFriendlyRectangle(Point p1, Point p2, Point p3, Point p4) {
		System.out.println("Created PrinterFriendlyRectangle with points: " + p1 + ", " + p2 + ", " + p3 + ", " + p4);
	}
	
	@Override
	public void draw() {
		System.out.println("PrinterFriendlyRectangle draw()");
	}
	
}
