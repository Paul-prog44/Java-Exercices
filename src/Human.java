
public class Human implements Comparable<Human>{
	private String name;
	private int wage;
	
	public Human(String name, int wage) {
		this.name = name;
		this.wage = wage;
	}
	@Override
	public int compareTo(Human human) {
		return human.getWage() - this.wage;
	}
	
	public int getWage() {
		return this.wage;
	}
	
	public String toString() {
		return this.name + " ,wages: " + this.wage;
	}
}	
