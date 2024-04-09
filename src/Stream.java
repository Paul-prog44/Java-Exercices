import java.util.ArrayList;
import java.util.Scanner;

public class Stream {
	ArrayList<Integer> userInputs;
	Scanner scanner = new Scanner(System.in);
	
	public Stream() {
		this.userInputs = new ArrayList<>();
	}
	
	
	public void filterNumbersOneToFive() {
		while (true) {
			System.out.println("Enter a number");
			int userNumber = Integer.valueOf(scanner.nextLine());
				if (userNumber < 0) {
					userInputs.stream()
						.filter(number -> number >= 1 && number <=5)
						.forEach(number -> System.out.println(number));
					break;
			}
			this.userInputs.add(userNumber);
			
			
		}
	}
}
	
	
