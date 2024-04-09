import java.util.List;

public class Main {
	
	public static void main(String[] args) {
        BooksFromFile books = new BooksFromFile();
        
        List<Book> listOfBooks = books.readBooks("books.txt");
        
        for (Book book : listOfBooks) {
            System.out.println(book.getPages());
        }

	}
}
