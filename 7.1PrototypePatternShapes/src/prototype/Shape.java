package prototype;

public abstract class Shape implements Cloneable {
	private String id;
	protected String type;
	
	public abstract void draw();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}
		
		return clone;
	}	
	
}
