
public class Book2 implements Packable {
	String author;
	String title;
	double weight;
	
	public Book2(String author, String title, double weight) {
		this.author = author;
		this.title = title;
		this.weight = weight;
	}
	
	public double weight() {
		return this.weight;
	}
	
	public String toString() {
		return this.author +": " + this.title;
	}
}
