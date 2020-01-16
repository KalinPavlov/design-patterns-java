package abstract_factory;

public class EnemyShipTesting {
	
	public static void main(String[] args) {
		
		EnemyShipt theGrunt = UFOEnemyShiptBuilding.orderShip("UFO");
		System.out.println(theGrunt + "\n");
		
		EnemyShip theBoss = UFOEnemyShiptBuilding.orderShip("UFO Boss");
		System.out.println(theGrunt + "\n");
	}
}
