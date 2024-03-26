import java.util.ArrayList;

public class GradeDistribution {
	ArrayList<Integer> grades;
	
	int grade0;
	int grade1;
	int grade2;
	int grade3;
	int grade4;
	int grade5;
	
	public GradeDistribution(ArrayList<Integer> grades) {
		this.grades = grades;
	}
	
	public void sortGradeDistribution() {
		for (int grade:grades) {
			if (grade < 50) {
				this.grade0++;
			}
			
			if (grade >= 50 && grade <60) {
				this.grade1++;
			}
			
			if (grade >= 60 && grade <70) {
				this.grade2++;
			}
			
			if (grade >= 70 && grade <80) {
				this.grade3++;
			}
			
			if (grade >= 80 && grade <90) {
				this.grade4++;
			}
			
			if (grade >= 90 && grade <=100) {
				this.grade5++;
			}
		}
	}
	
	public String displayStarsAccordingToGrade(int grade) {
		String stars = "";
		for (int i = 0; i <grade; i++) {
			stars = stars.concat("*");
		}
		return stars;
	}
	
}
