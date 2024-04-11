import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Person3 anna = new Person3("Anna", Education.PHD);
		Person3 bernard = new Person3("Bernard", Education.BA);
		Person3 didier = new Person3("Didier", Education.HS);
		Person3 marion = new Person3("Marion", Education.MA);


		Employees university  = new Employees();
		university .add(anna);
		university .add(bernard);
		university .add(didier);
		university .add(marion);
		university.add(new Person3("Petrus", Education.PHD));
		university.add(new Person3("Arto", Education.HS));
		university.add(new Person3("Elina", Education.PHD));
		
		university.print();
		university.fire(Education.HS);
		System.out.println("==");

		university.print();
	}
	
}
