import java.util.ArrayList;

public class GradeStatistics {
	private ArrayList<Integer> numbers;  
	
	public GradeStatistics () {
		this.numbers = new ArrayList();
	}
	
	public void add(int number) {
		
		if (number == -1) {
			System.out.println(numbers);
			int total = 0;
			for (Integer value:numbers) {
				total +=value;
				System.out.println(numbers.size());
			} 
			double average = (double) total/numbers.size();
			System.out.println("Point average (all): " + average);

		} else if (number > 0 && number <=100) {
			 this.numbers.add(number);
		}
	}
}
