package printwriter;

import java.io.PrintWriter;

public class Main {
	
	public static void main(String[] args) throws Exception  {
		
		Dictionary dictionary = new Dictionary();
		dictionary.add("singe", "monkey");
		dictionary.add("banane", "banana");
		dictionary.add("maison", "house");
		dictionary.add("epinard", "spinach");
		dictionary.add("stylo", "pen");





		System.out.println(dictionary.translate("singe"));
		System.out.println(dictionary.translate("maison"));
		System.out.println(dictionary.translate("epinard"));
		System.out.println(dictionary.translate("maison"));
		dictionary.delete("maison");
		System.out.println(dictionary.translate("maison"));
		System.out.println(dictionary.translate("stylo"));



	}	
}