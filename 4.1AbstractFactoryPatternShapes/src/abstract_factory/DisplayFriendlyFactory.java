package abstract_factory;

public class DisplayFriendlyFactory implements ShapeFactory {

	@Override
	public Shape getShape(String sourceType) {
		switch(sourceType) {
		case "Circle":
			return new DisplayFriendlyCircle(new Point(1, 1),  10);
		case "Rectangle":
			return new DisplayFriendlyRectangle(new Point(1, 1), new Point(1, 2), new Point(2, 1), new Point(2, 2));
		}
		return null;
	}

}
