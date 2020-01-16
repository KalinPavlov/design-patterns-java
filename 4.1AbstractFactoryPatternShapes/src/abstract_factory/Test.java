package abstract_factory;

public class Test {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		
		canvas.addNewShape("Circle", "DisplayFriendly");
		canvas.addNewShape("Rectangle", "PrinterFriendly");
		canvas.redraw();
	}

}
