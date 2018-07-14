import java.util.Random;

public class EnemyRobot {

	Random generator = new Random();
	
	public void smashWithHand() {
		int damage = generator.nextInt(10) + 1;
		
		System.out.println("Enemy robot causes " + damage + " with its hands.");
	}

	public void walkForward() {
		int movement = generator.nextInt(5) + 1;
		
		System.out.println("Enemy robot walks forward " + movement +" spaces");
	}
	
	public void reactToHuman(String driverName) {
		System.out.println("Enemy Robot tramps on " + driverName);
	}
}
