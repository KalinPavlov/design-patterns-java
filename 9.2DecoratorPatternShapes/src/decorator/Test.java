package decorator;

public class Test {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle();		
		Shape redBorderRectangle = new RedShapeDecorator(rectangle);
		redBorderRectangle.draw();

		System.out.println();
		
		Shape circle = new Circle();
		Shape redBorderCircle = new RedShapeDecorator(circle);
		redBorderCircle.draw();
	}

}
