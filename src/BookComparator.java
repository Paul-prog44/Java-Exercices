import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BookComparator {
	private ArrayList<Book3> books = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public void compareBooks() {
		while (true) {
			System.out.print("Input the name of the book, empty stops: ");
			String title = scanner.nextLine();
			if (title.equals("")) {
				System.out.println(books.size() + " books in total.");
				System.out.println("");
				//Tri les livres en fonction de l'age
				Comparator<Book3> comparator = Comparator
						.comparing(Book3::getAge)
						.thenComparing(Book3::getTitle);
				
				Collections.sort(books, comparator);
				
				for (Book3 book:books) {
					System.out.println(book.getTitle() + " (recommended for " + book.age + " year-olds or older)");
				}
				break;
			}
			System.out.println("Input the age recommendation: ");
			int age = Integer.valueOf(scanner.nextLine());
			books.add(new Book3(title, age));
		}
		
		
		
	}
}
