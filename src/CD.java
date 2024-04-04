
public class CD implements Packable {
	String artist;
	String title;
	int publicationYear;
	double weight = 0.1;
	
	public CD(String artist, String title, int publicationYear) {
		this.artist = artist;
		this.title = title;
		this.publicationYear = publicationYear;
	}
	
	public double weight() {
		return this.weight;
	}
	
	public String toString() {
		return this.artist + ": " + this.title + "(" + this.publicationYear + ")";
	}
 }
