import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		GradeStatistics statistics = new GradeStatistics();
	
		while (true) {
			System.out.println("Enter point totals, -1 stops: : ");
			String command = scanner.nextLine();
			statistics.add(Integer.valueOf(command));
		}

	}
}
