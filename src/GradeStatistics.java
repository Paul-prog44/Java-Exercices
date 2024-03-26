import java.util.ArrayList;

public class GradeStatistics {
	private ArrayList<Integer> numbers; 
	private ArrayList<Integer> gradesAboveAverage;
	
	public GradeStatistics () {
		this.numbers = new ArrayList();
		this.gradesAboveAverage = new ArrayList<>();
	}
	
	//Adds number to list
	public void add(int number) {
		this.numbers.add(number);
	}
	
	//Add number to gradesAboveAverage
	public void addToGradesAboveAverage(int number) {
		this.gradesAboveAverage.add(number);
	}
	
	//Returns average of all grades
	public double getAverage() {
		int total = 0;
		for (Integer value:numbers) {
			total +=value;
		} 
		double average = (double) total/numbers.size();
		return average;
	}
	
	//Returns average of grades above 50
	public double getGradesAboveAverage() {
		if (gradesAboveAverage.size() > 0) {
			double sumOfGrades = 0;
			for (Integer grade:gradesAboveAverage) {
				sumOfGrades += grade;
			}
			double average = (double) sumOfGrades / gradesAboveAverage.size();
			return average;
		}
		return 0.0;
		
	}
	
	//Returns pass percentage
	public double getPassPercentage() {
		return 100*this.gradesAboveAverage.size()/this.numbers.size();
	}
	
	public ArrayList<Integer> getGradesArrayList() {
		return this.numbers;
	}
}
