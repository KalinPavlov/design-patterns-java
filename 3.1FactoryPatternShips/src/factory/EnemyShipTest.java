package factory;

import java.util.Scanner;

public class EnemyShipTest {

	public static void main(String[] args) {
		try (Scanner userInput = new Scanner(System.in);) {

			EnemyShip enemyShip = null;
			String enemyShiptOption = "";

			System.out.println("Select type of ship (UFO / Rocket)");

			if (userInput.hasNextLine()) {
				enemyShiptOption = userInput.nextLine();
				enemyShip = ShiptFactory.makeEnemyShip(enemyShiptOption);
			}

			if (enemyShip != null) {
				doStuffEnemy(enemyShip);
			} else {
				System.out.println("The available options for ships are 'UFO' and 'Rocket'");
			}
		}
	}

	public static void doStuffEnemy(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}

}
