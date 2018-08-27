import java.util.Iterator;

public class DiscJockey {
	
	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;
	
	public DiscJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {
		iter70sSongs = newSongs70s;
		iter80sSongs = newSongs80s;
		iter90sSongs = newSongs90s;
	}

	public void showTheSongs() {
		Iterator songs70s = iter70sSongs.createIterator();
		Iterator songs80s = iter80sSongs.createIterator();
		Iterator songs90s = iter90sSongs.createIterator();
		
		System.out.println(System.lineSeparator() + "Songs of the 70s" + System.lineSeparator());
		printTheSongs(songs70s);
		
		System.out.println(System.lineSeparator() + "Songs of the 80s" + System.lineSeparator());
		printTheSongs(songs80s);
		
		System.out.println(System.lineSeparator() + "Songs of the 90s" + System.lineSeparator());
		printTheSongs(songs90s);
	}
	
	public void printTheSongs(Iterator iterator) {
		while (iterator.hasNext()) {
			SongInfo songInfo = (SongInfo) iterator.next();
			
			System.out.println(songInfo.getSongName());
			System.out.println(songInfo.getBandName());
			System.out.println(songInfo.getYearReleased());
		}
	}
}
