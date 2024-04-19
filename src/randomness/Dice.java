package randomness;

import java.util.Random;

public class Dice {
	private Random random;
	private int numberOfFaces;
	
	public Dice(int numberOfFaces) {
		this.random = new Random();
		this.numberOfFaces = numberOfFaces;
	}
	
	public int throwDice() {
		int randomNumber = random.nextInt(this.numberOfFaces)+1;
		return randomNumber;
	}
}
