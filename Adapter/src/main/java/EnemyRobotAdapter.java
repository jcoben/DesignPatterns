
public class EnemyRobotAdapter implements EnemyAttacker {

	private EnemyRobot enemyRobot;
	
	public EnemyRobotAdapter(EnemyRobot newRobot) {
		enemyRobot = newRobot;
	}

	@Override
	public void fireWeapon() {
		enemyRobot.smashWithHand();
	}

	@Override
	public void driveForward() {
		enemyRobot.walkForward();
	}

	@Override
	public void assignDriver(String newDriver) {
		enemyRobot.reactToHuman(newDriver);
	}
}
