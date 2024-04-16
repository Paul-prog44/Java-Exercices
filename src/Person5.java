
public class Person5 {
	String name;
	int age;
	
	public Person5(String name, int age) {
		if (name == null || name.length() > 40 || name.isEmpty() || age < 0 || age > 120 ) {
			throw new IllegalArgumentException("Incorrect value");
		}
		
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return this.name +" is " + this.age + " yo.";
	}
}
