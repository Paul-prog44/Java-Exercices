import java.util.ArrayList;

public class AmusementParkRide {
	private String name;
	private int minimumHeight;
	private int visitors;
	private ArrayList<Person> riding;
	
	public AmusementParkRide(String name, int minimumHeight) {
		this.name = name;
		this.minimumHeight = minimumHeight;
		this.visitors = 0;
		this.riding = new ArrayList<>();
	}
	
	public boolean isAllowedOn(Person person) {
		if (person.getHeight() < this.minimumHeight) {
			return false;
		}
		
		this.visitors++;
		this.riding.add(person);
		return true;
	}
	
	public String toString() {
		String printOutput = this.name + ", minimum height requirement: " + this.minimumHeight +
				", visitors: " + this.visitors + "\n";
		
		if (riding.isEmpty()) {
			return printOutput + "no one is on the ride.";
		}
		
		String onTheRide= "";
		for (Person person : riding) {
			onTheRide = onTheRide + person.getName() + "\n";
		}
		
		return this.name + "minimum height requirement: " + this.minimumHeight +
				", visitors: " + this.visitors + "\n" +
		"riding: " + onTheRide;
	}
	
	public void removeEveryoneOnRide() {
		this.riding.clear();
	}
	
	public double averageHeightOfPeopleOnRide() {
		if (riding.isEmpty()) {
			return -1;
		}
		
		int sumOfHeights = 0;
		for (Person person : riding) {
			sumOfHeights = sumOfHeights + person.getHeight();
		}
		
		return 1.0 * sumOfHeights / riding.size();
	}
	
	public Person getTallest() {
		if (this.riding.isEmpty()) {
			return null;
		}
		
		Person tallestPerson = riding.get(0);
		for (Person person : riding) {
			if (person.getHeight() > tallestPerson.getHeight()) {
				tallestPerson = person;
			}
		}
		return tallestPerson;
	
	}
}
