import java.util.Scanner;

public class UserIntefaceGradeDistribution {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		GradeStatistics statistics = new GradeStatistics();
	
		System.out.println("Enter point totals, -1 stops:");

		while (true) {
			int number = Integer.valueOf(scanner.nextLine());
			
			if (number == -1) {
				GradeDistribution gradeDistribution = new GradeDistribution(statistics.getGradesArrayList());
				gradeDistribution.sortGradeDistribution();
				
				System.out.println("Point average (all) : " +statistics.getAverage());
				System.out.println("Point average (passing)"+statistics.getGradesAboveAverage());
				System.out.println("Pass percentage "+statistics.getPassPercentage());
				System.out.println("5:" + gradeDistribution.displayStarsAccordingToGrade(gradeDistribution.grade5));
				System.out.println("4:" + gradeDistribution.displayStarsAccordingToGrade(gradeDistribution.grade4));
				System.out.println("3:" + gradeDistribution.displayStarsAccordingToGrade(gradeDistribution.grade3));
				System.out.println("2:" + gradeDistribution.displayStarsAccordingToGrade(gradeDistribution.grade2));
				System.out.println("1:" + gradeDistribution.displayStarsAccordingToGrade(gradeDistribution.grade1));
				System.out.println("0:" + gradeDistribution.displayStarsAccordingToGrade(gradeDistribution.grade0));

			}
			
			if (number > 0 && number <= 100) {
				statistics.add(Integer.valueOf(number));
			}
			
			if (number > 50 && number <= 100) {
				statistics.addToGradesAboveAverage(number);
			}
		}

	}
}
