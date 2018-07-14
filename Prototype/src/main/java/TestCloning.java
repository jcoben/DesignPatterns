
public class TestCloning {

	public static void main(String[] argv) {
		CloneFactory animalMaker = new CloneFactory();
		
		Sheep sally = new Sheep();
		
		Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
		
		System.out.println(sally);
		
		System.out.println(clonedSheep);
		
		System.out.println("Sally hash: " + System.identityHashCode(sally));
		System.out.println("Cloned hash: " + System.identityHashCode(clonedSheep));
	}
}
