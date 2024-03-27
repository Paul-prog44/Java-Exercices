
public class Bird {
	String name;
	String latinName;
	int observation;
	
	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
	}
	
	public void addObservation() {
		this.observation++;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.name + "(" + this.latinName + "):" + this.observation +" observations";
	}
}
