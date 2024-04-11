import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Checker checker = new Checker();
		
		while (true) {
			System.out.print("Enter a string: ");
			String input = scanner.nextLine();
			
			if (checker.timeOfDay(input)) {
				System.out.println("The form is correct");
			} else {
				System.out.println("The form is incorrect");
			}
			
			
			
		}
		
	}
	
}
