
public abstract class EnemyShip {
	
	private String name;
	ESWeapon weapon;
	ESEngine engine;
	
	abstract void makeShip();
	
	public String toString() {
		return "The " + name + " has a top speed of " + 
				engine + " and an attack power of " + weapon;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void followHeroShip() {
		System.out.println(getName() + " is following the hero at " + engine);
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + weapon);
	}
}
