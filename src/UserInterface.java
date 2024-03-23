import java.util.Scanner;

public class UserInterface {
	private JokeManager jokeManager;
	private Scanner scanner;
	
	public UserInterface(JokeManager jokeManager, Scanner scanner) {
		this.jokeManager = jokeManager;
		this.scanner = scanner;
	}
	
	public void start() {
		while (true) {
			System.out.println("Commands");
			System.out.println("1-Add a joke");
			System.out.println("2-Draw a joke");
			System.out.println("3-List jokes");
			System.out.println("X-Stop");

			String input = scanner.nextLine();
			
			if (input.equals("X")) {
				break;
			}
			if (Integer.valueOf(input)== 1) {
				System.out.println("Writte a joke to be added :");
				String joke = scanner.nextLine();
				jokeManager.addJoke(joke);
			}
			
			if (Integer.valueOf(input)== 2) {
				System.out.println(jokeManager.drawJoke());
			}
			
			if (Integer.valueOf(input)== 3) {
				jokeManager.printJokes();
			}
		}
	}
	
}
