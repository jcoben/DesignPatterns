import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] argv) {
		EnemyShipFactory shipFactory = new EnemyShipFactory();

		EnemyShip theEnemy = null;

		Scanner userInput = new Scanner(System.in);

		System.out.println("What type of ship? (U / R / B)");

		while (theEnemy == null) {
			if (userInput.hasNextLine()) {
				String newShipType = userInput.nextLine();
				theEnemy = shipFactory.makeEnemyShip(newShipType);
			}
		}

		doStuffEnemy(theEnemy);
	}

	private static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
