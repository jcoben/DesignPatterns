import java.util.LinkedList;

public class ScrabbleTest {
	
	public static void main(String[] argv) {
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance ID: " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("Player 1: " + playerOneTiles);
		
		Singleton instanceTwo = Singleton.getInstance();
		
		System.out.println("Instance 2 ID: " + System.identityHashCode(instanceTwo));
		
		LinkedList<String> player2Tiles = instanceTwo.getTiles(7);
		
		System.out.println("Player 2: " + player2Tiles);
	}
}
