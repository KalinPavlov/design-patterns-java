package dao;


public class Circle{
	
	private int xPos;
	private int yPos;
	private int radius;
	
	public Circle(int xPos, int yPos, int radius) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "center = (" + xPos + ", " + yPos + ") and radius = " + radius;
	}
	
	public CircleTransfer getCircleTransferObject() {
		CircleTransfer ct = new CircleTransfer();
		ct.setxPos(xPos);
		ct.setyPos(yPos);
		ct.setRadius(radius);
		return ct;
	}
}
