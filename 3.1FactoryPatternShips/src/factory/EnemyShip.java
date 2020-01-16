package factory;

public abstract class EnemyShip {
	private String name;
	private double amtDamage;
	
	public EnemyShip(String name, double amtDamage) {
		this.name = name;
		this.amtDamage = amtDamage;
	}
	
	public void followHeroShip() {
		System.out.println(name + " is following the hero.");
	} 
	
	public void displayEnemyShip() {
		System.out.println(name + " is on the screen.");
	}
	
	public void enemyShipShoots() {
		System.out.println(name + " attacks and does " + amtDamage + " damage");
	}
	
	public String getName() { return name; }
	
	public double getDamage() { return amtDamage; }
}
