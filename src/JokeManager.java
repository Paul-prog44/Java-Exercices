import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
	private ArrayList<String> jokeList;
	
	public JokeManager() {
		this.jokeList = new ArrayList<>();
	}
	
	public void addJoke(String joke) {
		this.jokeList.add(joke);
	}
	
	public String drawJoke() {
		if (jokeList.isEmpty()) {
			return "Jokes are in short supply.";
		}
		int min=0;
		int max=jokeList.size();
		
		Random random = new Random();
		int randomNumber = random.nextInt(max - min)+ min;
		return jokeList.get(randomNumber);
	}
	
	public void printJokes() {
		for (String joke:jokeList) {
			System.out.println(joke);
		}
	}
}
