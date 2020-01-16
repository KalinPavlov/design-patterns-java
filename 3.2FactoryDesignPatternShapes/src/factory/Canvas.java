package factory;

import java.util.ArrayList;

public class Canvas {
	private ArrayList<Shape> shapeList = new ArrayList<>();
	
	public void addNewShape(String shapeType) {
		Shape shape = ShapeFactory.getShape(shapeType);
		shapeList.add(shape);
	}
	
	public void redraw() {
		for (Shape shape : shapeList){
			shape.draw();
		}
	}
}
