package observer;

public class Test {

	public static void main(String[] args) {
		Circle circle = new Circle(10, 10, 20);
		System.out.println(circle);
		circle.addObserver(new Canvas());
		circle.addObserver(new ShapeArchiver());
		
		circle.setCenter(new Point(2, 3));
		System.out.println(circle);
		circle.setRadius(7);
		System.out.println(circle);
	}

}
