package printwriter;

import java.io.PrintWriter;

public class Main {
	
	public static void main(String[] args) throws Exception  {
		
		Dictionary dictionary = new Dictionary();
		dictionary.add("apina", "monkey");
		dictionary.add("banaani", "banana");
		dictionary.add("apina", "apfe");

		System.out.println(dictionary.translate("apina"));
		System.out.println(dictionary.translate("monkey"));
		System.out.println(dictionary.translate("ohjelmointi"));
		System.out.println(dictionary.translate("banana"));
	}	
}