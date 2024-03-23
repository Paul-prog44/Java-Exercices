
public class HealthStation {
	int weighings;
	
	public int weigh(Person person) {
		this.weighings++;
		return person.getWeight();
	}
	
	public void feed (Person person) {
		person.setWeight(person.getWeight() +1);
	}
	
	public int getWeighings() {
		return weighings;
	}
}
