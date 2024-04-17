package printwriter;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
	private HashMap<String, String> words;
	
	public Dictionary() {
		words = new HashMap<>();
	}

	
	public void add(String word , String translation) {
		try (Scanner scanner = new Scanner(Paths.get("toWrite.txt"))) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split(",");
				words.put(parts[0], parts[1]);
				System.out.println(parts[0] + " " +parts[1]);
				}
			
			} catch (Exception e) {
				System.out.println(e);
			}
		if (!(words.containsKey(word))) {
			words.put(word, translation);
		}
		
		try {
			PrintWriter writer = new PrintWriter("toWrite.txt");
			for (String key : words.keySet()) {
				String value = words.get(key);
				writer.println(key + "," + value);
				writer.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	public String translate(String word) {
		return words.get(word);
	}
}
