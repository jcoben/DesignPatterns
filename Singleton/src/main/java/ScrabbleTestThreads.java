
public class ScrabbleTestThreads {

	public static void main(String[] argv) {
		Runnable getTiles = new GetTheTiles();
		
		Runnable getTilesAgain = new GetTheTiles();
		
		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
	}
}
