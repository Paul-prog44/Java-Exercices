import java.util.Scanner;

public class TextUI {
	private Scanner scanner;
	private SimpleDictionary simpleDictionary;
	
	public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
		this.scanner = scanner;
		this.simpleDictionary = simpleDictionary;
	}
	
	public void start() {
		while (true) {
			System.out.println("Enter a command :");
			String command = scanner.nextLine();
			if (command.equals("end")) {
				System.out.println("Bye bye !");
				break;
			} else if (command.equals("add")) {
				System.out.println("Enter a word in english");
				String englishWord = scanner.nextLine();
				System.out.println("Enter a word in finish");
				String finishWord = scanner.nextLine();

				simpleDictionary.add(englishWord, finishWord);
			} else if (command.equals("search")) {
				System.out.println("Word to translate ?");
				String wordToTranslate = scanner.nextLine();
				if (simpleDictionary.translate(wordToTranslate) == null) {
					System.out.println(wordToTranslate+ " was not found.");
				} else {
					System.out.println(simpleDictionary.translate(wordToTranslate));
				}
			} else {
				System.out.println("Unknow command");
			}
		}
		
		
	}
}
