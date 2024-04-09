
public class Student2 implements Comparable<Student2>{
	private String name;
	
	public Student2(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
	
	@Override
	public int compareTo(Student2 student) {
		return this.name.compareTo(student.getName());
	}
	
	public String getName() {
		return this.name;
	}
	
}
