package factory;

import java.util.ArrayList;

public class Canvas {
	private ArrayList<Shape> shapeList = new ArrayList<>();
	
	public void addNewShare(String shapeType) {
		Shape shape = ShapeFactory.getShare(shapeType);
		shapeList.add(shape);
	}
	
	public void redraw() {
		for (Shape shape : shapeList){
			shape.draw();
		}
	}
}
