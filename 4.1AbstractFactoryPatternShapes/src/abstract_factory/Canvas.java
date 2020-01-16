package abstract_factory;

import java.util.ArrayList;

public class Canvas {
	private ArrayList<Shape> shapeList = new ArrayList<>();
	
	public void addNewShape(String shapeType, String shapePurpose) {
		Shape shape = null;
		switch (shapePurpose) {
		case "DisplayFriendly":
			shape = new DisplayFriendlyFactory().getShape(shapeType);
			break;
		case "PrinterFriendly":
			shape = new PrinterFriendlyFactory().getShape(shapeType);
			break;
		}
		shapeList.add(shape);
	}
	
	public void redraw() {
		for (Shape shape : shapeList){
			shape.draw();
		}
	}
}
