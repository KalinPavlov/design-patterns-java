package factory;

public class ShiptFactory {
	
	public static EnemyShip makeEnemyShip(String newShipType) {
		
		EnemyShip newShip = null;
		switch (newShipType) {
		case "UFO":
			newShip = new UFOEnemyShip();
			break;
		case "Rocket":
			newShip = new RocketEnemyShip();
			break;
		default:
			System.out.println("Unknown ship type");
			break;
		}
		
		return newShip;
	}
}
