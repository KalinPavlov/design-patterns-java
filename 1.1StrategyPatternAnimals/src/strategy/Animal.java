package strategy;

public class Animal {
	
	private String name;
	private double height;
	private double weight;
	private String favFood;
	private double speed;
	private String sound;
	
	private Flies flyingType;
	
	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public double getHeight() { return height; }

	public void setHeight(double height) { this.height = height; }

	public double getWeight() {	return weight; }

	public void setWeight(double weight) { this.weight = weight; }

	public String getFavFood() { return favFood; }

	public void setFavFood(String favFood) { this.favFood = favFood; }

	public double getSpeed() { return speed; }

	public void setSpeed(double speed) { this.speed = speed; }

	public String getSound() { return sound; }

	public void setSound(String sound) { this.sound = sound; }
	
	public void setFlyingType(Flies flyingType) { this.flyingType = flyingType; }
	public String tryToFly() { return flyingType.fly();	}
	
}
