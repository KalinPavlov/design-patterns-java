package abstract_factory;

public abstract class EnemyShipBuilding {
	
	protected abstract EnemyShip makeEnemyShip(String shipType);
	
	public static EnemyShip orderShip(String shipType) {
		EnemyShip enemyShip = makeEnemyShip(shipType);
		
		enemyShip.makeShip();
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.shoot();
		
		return enemyShip;
	}
}
