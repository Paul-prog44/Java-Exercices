import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastName {
	ArrayList<Person2> persons = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public void uniqueLastName() {
		while (true) {
			System.out.print("Continue personal information input? 'quit' ends :");
			String command = scanner.nextLine();
			if (command.equals("quit")) {
				persons.stream()
					.distinct()
					.map(person -> person.getLastName())
					.sorted()
					.forEach(person -> System.out.println(person));
				break;
			}
			
			System.out.print("Input first name: ");
			String firstName = scanner.nextLine();
			System.out.println("Input last name : ");
			String lastName = scanner.nextLine();
			System.out.println("Input year of birth: ");
			int yearOfBirth = Integer.valueOf(scanner.nextLine());
			this.persons.add(new Person2(firstName, lastName, yearOfBirth));
			
		}
	}
}
