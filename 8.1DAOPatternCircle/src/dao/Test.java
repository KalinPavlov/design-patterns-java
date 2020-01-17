package dao;

public class Test {

	public static void main(String[] args) {
		Circle circle = new Circle(10, 10, 10);
		System.out.println(circle);
		
		CircleTransfer ct = circle.getCircleTransferObject();
		CircleDAO circleDAO = DAOFactory.getCircleDAO("RDBMS");
		circleDAO.insertCircle(ct);
		circleDAO.getCircle(1);
		circleDAO.deleteCircle(1);
	}

}
