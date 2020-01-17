package dao;

public interface CircleDAO {
	public void insertCircle(CircleTransfer ct);
	public CircleTransfer getCircle(int id);
	public void deleteCircle(int id);
}
