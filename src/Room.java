import java.util.ArrayList;

public class Room {
	private ArrayList<Person> persons;
	
	public Room() {
		this.persons = new ArrayList<>();
	}
	
	public void add(Person person) {
		this.persons.add(person);
	}
	
	public boolean isEmpty() {
		return persons.isEmpty();
	}
	
	public ArrayList<Person> getPersons() {
		return persons;
	}
	
	public Person shortest() {
		if (persons.isEmpty()) {
			return null;
		}
		
		Person shortestPerson = persons.get(0);
		for (Person person:persons) {
			if (person.getHeight()< shortestPerson.getHeight()) {
				shortestPerson = person;
			}
		}
		
		return shortestPerson;
		
	}
	
	public Person take() {
		if (persons.isEmpty()) {
			return null;
		}
		
		int indexOfShortestPerson = 0;
		Person shortestPerson = persons.get(0);
		for (Person person:persons) {
			if (person.getHeight()< shortestPerson.getHeight()) {
				indexOfShortestPerson = persons.indexOf(person);
			}
		}
		
		 return persons.remove(indexOfShortestPerson);
	}
}
