import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BooksFromFile {
	
	
	public static List<Book> readBooks(String file) {
		List<Book> books = new ArrayList<>();
		
		try {
			Files.lines(Paths.get(file))
				.map(row -> row.split(","))
				.map(parts -> new Book(parts[3], parts[0], Integer.valueOf(parts[2]), Integer.valueOf(parts[1])))
				.forEach(book -> books.add(book));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return books;
	}
}
