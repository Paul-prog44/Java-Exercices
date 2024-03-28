import java.lang.Override;

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
	
	
	public boolean equals(Book1 comparedObject) {
		if (this == comparedObject) {
			return true;
		}
		
		if (!(comparedObject instanceof Book1)) {
			return false;
		}
		
		Book1 comparedBook = (Book1) comparedObject;
		
		if (this.name.equals(comparedObject.name) &&
			this.date == comparedObject.date &&
			this.content.equals(comparedObject.content)) {
			return true;
		}
		
		return false;
	}
	
	public int hashCode() {
		if (this.name== null) {
			return this.date;
		}
		return this.date + this.name.hashCode();
	}
}
