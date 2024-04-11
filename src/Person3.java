
public class Person3 {
	private String name;
	private Education education;
	
	public Person3(String name, Education education) {
		this.name = name;
		this.education = education;
	}
	
	public Education getEducation() {
		return this.education;
	}
	
	public String toString() {
		return this.name + ", " + this.education;
	}
}
