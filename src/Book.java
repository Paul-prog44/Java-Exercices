
public class Book {
	String author;
	String name;
	int pages;
	int publicationYear;
	
	public Book(String name, int publicationYear) {
		this.name = name;
		this.publicationYear = publicationYear;
	}
	
	public Book(String author, String name, int pages, int publicationYear) {
		this.author = author;
		this.name = name;
		this.pages = pages;
		this.publicationYear = publicationYear;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPages() {
		return this.pages;
	}
	
	public String toString() {
		return this.author + ", " + this.name + ", " + this.pages + " pages";
	}
	
	public boolean equals(Object compared) {
		//verif emplacement
		if (this == compared) {
			return true;
		}
		//verif instance
		if (!(compared instanceof Book)) {
			return false;
		}
		//cast et verif valeur
		Book comparedBook = (Book) compared;
		
		if (comparedBook.name.equals(this.name) &&
			comparedBook.publicationYear == this.publicationYear) {
			return true;
		}
		
		return false;
			
		
	}
}
