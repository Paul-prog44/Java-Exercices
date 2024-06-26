import java.util.HashMap;

public class Abbreviations {
	HashMap<String, String> abbreviations;
	
	public Abbreviations() {
		this.abbreviations = new HashMap<>();
	}
	
	public void addAbbreviation(String abbreviation, String explanation) {
		this.abbreviations.put(abbreviation, explanation);
	}
	
	public boolean hasAbbreviation(String abbreviation) {
		return this.abbreviations.containsKey(abbreviation);
	}
	
	public String findExplanationFor(String abbreviation) {
		if (this.abbreviations.containsKey(abbreviation)) {
			return this.abbreviations.get(abbreviation);
		} else {
			return null;
		}
	}
}
