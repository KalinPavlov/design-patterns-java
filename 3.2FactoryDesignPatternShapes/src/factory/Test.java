package factory;

public class Test {
	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		canvas.addNewShare("Circle");
		canvas.addNewShare("Rectangle");
		canvas.redraw();
	}
}
