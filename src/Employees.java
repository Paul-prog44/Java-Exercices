import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
	private List<Person3> employees;
	
	public Employees() {
		this.employees = new ArrayList<>();
	}
	
	public void add(Person3 personToAdd) {
		this.employees.add(personToAdd);
	}
	
	public void add(List<Person3> peopleToAdd) {
		Iterator<Person3> iterator= peopleToAdd.iterator();
		
		while(iterator.hasNext()) {
			employees.add(iterator.next());
		}
	}
	
	public void print() {
		Iterator<Person3> iterator = this.employees.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void print(Education education) {
		Iterator<Person3> iterator = this.employees.iterator();
		
		while(iterator.hasNext()) {
			Person3 person = iterator.next();  
			if (person.getEducation() == education) {
				System.out.println(person);
			}
		}
	}
	
	public void fire(Education education) {
		Iterator<Person3> iterator = this.employees.iterator();
		
		while(iterator.hasNext()) {
			if (iterator.next().getEducation() == education) {
				iterator.remove();
			}
		}
	}
}
