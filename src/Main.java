import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Container container1 = new Container();
		Container container2 = new Container();
		
		while (true) {
			System.out.println("Command :");
			String input = scanner.nextLine();
			String[] parts = input.split(" ");
			
			String command = parts[0];
			int amount = Integer.valueOf(parts[1]);
			
			if (command.equals("quit")) {
				break;
			}
			
			if (command.equals("add")) {
				container1.add(amount);
				System.out.println("First: " + container1);
				System.out.println("Second: " + container2);

			}
			
			if (command.equals("move")) {
				if (amount <= container1.contains()) {
					container1.remove(amount);
					container2.add(amount);
				} else if (amount > container1.contains()){
					container1.remove(container1.contains());
					 if (amount + container2.contains() <= 100) {
						 container2.add(amount);
					 }
				}
				
				System.out.println("First: " + container1);
				System.out.println("Second: " + container2);
			}
			
			if (command.equals("remove")) {
				container2.remove(amount);
				System.out.println("First: " + container1);
				System.out.println("Second: " + container2);
			}
		}
	}
}
