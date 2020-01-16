package factory;

public class ShapeFactory {

	public static Shape getShape(String sourceType) {
		switch (sourceType) {
		case "Circle":
			return new Circle(new Point(10, 10), 20);
		case "Rectangle":
			return new Rectangle(new Point(1, 1), new Point(4, 1), new Point(1, 4), new Point(4, 4));
		}

		return null;
	}
}
