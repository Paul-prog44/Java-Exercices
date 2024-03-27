import java.util.ArrayList;
import java.util.Scanner;

public class ContainerUserInterface {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Container2 firstContainer = new Container2();
		Container2 secondContainer = new Container2();
		
		
		while (true) {
			System.out.println("Command:");
			String command = scanner.nextLine();
			String[] parts = command.split(" ");
		
			if (parts[0].equals("quit")) {
				break;
			}
			
			int liquid = Integer.valueOf(parts[1]);

			
			if (parts[0].equals("add")) {
				if (liquid > 0 && firstContainer.getLiquid()+ liquid <= 100) {
					firstContainer.add(liquid);
					System.out.println("First: "+ firstContainer);
					System.out.println("Second: "+ secondContainer);

				}
				
				if (firstContainer.getLiquid()+ liquid > 100) {
					firstContainer.setLiquid(100);
					System.out.println("First: "+ firstContainer);
					System.out.println("Second: "+ secondContainer);
				}
			}
			
			if (parts[0].equals("move")) {
				if (liquid > 0 ) {
					if (firstContainer.getLiquid()> liquid) {
						firstContainer.remove(liquid);
						if (secondContainer.getLiquid() + liquid <= 100) {
							secondContainer.add(liquid);
							System.out.println("First: "+ firstContainer);
							System.out.println("Second: "+ secondContainer);
						} else {
							secondContainer.setLiquid(100);
							System.out.println("First: "+ firstContainer);
							System.out.println("Second: "+ secondContainer);
						}
					} else {
						firstContainer.setLiquid(0);
						if (secondContainer.getLiquid()+ liquid <= 100){
							secondContainer.add(liquid);
							System.out.println("First: "+ firstContainer);
							System.out.println("Second: "+ secondContainer);
						} else {
							secondContainer.setLiquid(100);
							System.out.println("First: "+ firstContainer);
							System.out.println("Second: "+ secondContainer);
						}
					}
				}
			}
			
			if (parts[0].equals("remove")) {
				if (liquid > 0) {
					if (secondContainer.getLiquid() >= liquid) {
						secondContainer.remove(liquid);
						System.out.println("First: "+ firstContainer);
						System.out.println("Second: "+ secondContainer);
					} else {
						secondContainer.setLiquid(0);
						System.out.println("First: "+ firstContainer);
						System.out.println("Second: "+ secondContainer);
					}
				}
			}
		}
	}
}
