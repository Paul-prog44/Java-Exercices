
public class Song {
	String artist;
	String title;
	int year;
	
	public Song(String artist, String title, int year) {
		this.artist = artist;
		this.title = title;
		this.year = year;
	}
	
	public boolean equals(Song comparedSong) {
		if (comparedSong == this) {
			return true;
		}
		
		if (!(comparedSong instanceof Song)) {
			return false;
		}
		
		Song newComparedSong = (Song) comparedSong;
		
		if (this.artist.equals(newComparedSong.artist) &&
			this.title.equals(newComparedSong.title) &&
			this.year == newComparedSong.year) {
				return true;
			}
		
		return false;
	}
	
}
