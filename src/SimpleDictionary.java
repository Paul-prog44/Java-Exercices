import java.util.HashMap;
import java.util.Map;

public class SimpleDictionary {
	private Map<String, String> wordList;
	
	public SimpleDictionary() {
		this.wordList = new HashMap<>();
	}
	
	public void add(String englishWord, String finnishWord) {
		wordList.put(englishWord, finnishWord);
	}
	
	public String translate(String englishWord) {
		return wordList.get(englishWord);
	}
}
