
public class Book1 {
	String name;
	int date;
	String content;
	
	public Book1(String name,int date,String content) {
		this.name = name;
		this.date = date;
		this.content = content;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.name + "(" + this.date + ")\nContents: " + this.content;
	}
}
