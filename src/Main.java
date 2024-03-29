import java.util.ArrayList;
import java.util.HashMap;



public class Main {
	
	public static void printPersons(ArrayList<Person1> persons) {
		for (Person1 person:persons) {
			System.out.println(person);
		}
	}
	public static void main(String[] args) {
		ArrayList<Person1> persons = new ArrayList<Person1>();
	    persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
	    persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

	    printPersons(persons);
	}
}
