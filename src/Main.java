import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Student2> students = new ArrayList<>();
		
		students.add(new Student2("John"));
		students.add(new Student2("zoro"));
		students.add(new Student2("Gerald"));
		students.add(new Student2("Marine"));
		students.add(new Student2("Julia"));

		
		students.stream().forEach(student -> System.out.println(student));
		Collections.sort(students);
		System.out.println("");
		students.stream().forEach(student -> System.out.println(student));
	}
	
}
