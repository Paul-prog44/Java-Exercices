package randomness;

import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
	private ArrayList<Integer> numbers;
	Random random = new Random();
	
	public LotteryRow() {
		this.randomizeNumbers();
	}
	
	public ArrayList<Integer> numbers(){
		return this.numbers;
	}
	
	public boolean containsNumber(int number) {
		if (this.numbers.contains(number)) {
			return true;
		}
		return false;
	}
	
	public void randomizeNumbers() {
		this.numbers = new ArrayList<>();
		while (this.numbers.size() < 7){
			int randomNumber = random.nextInt(41);
			if (!(this.containsNumber(randomNumber))) {
				this.numbers.add(randomNumber);

			}
		}
	}
	
	public boolean equals(Object other) {
		return false;
	}
}
