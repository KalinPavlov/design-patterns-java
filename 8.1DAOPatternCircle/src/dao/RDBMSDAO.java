package dao;

public class RDBMSDAO implements CircleDAO {

	@Override
	public void insertCircle(CircleTransfer ct) {
		System.out.println("Circle: inserted into DB");		
	}

	@Override
	public CircleTransfer getCircle(int id) {
		System.out.println("Got Circle with id: " + id);
		return null;
	}

	@Override
	public void deleteCircle(int id) {
		System.out.println("Circle with id: " + id + " deleted from DB");
	}
	
}
