import java.util.HashMap;

public class Program {
	
	public static void printKeys(HashMap<String, String> hashmap ) {
		for (String name: hashmap.keySet()) {
			System.out.println(name);
		}
	}
	
	public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
		for (String name: hashmap.keySet()) {
			if (name.contains(text)) {
			System.out.println(name);	
			}
		}
	}
	
	public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
		for (String name: hashmap.keySet()) {
			if (name.contains(text)) {
				System.out.println(hashmap.get(name));
			}
		}
	}
	
	public static void printValues(HashMap<String, Book1> hashmap) {
		for (Book1 values: hashmap.values()) {
			System.out.println(values);
		}
	}
	
	public static void printValueIfNameContains(HashMap<String, Book1> hashmap, String text) {
		for (Book1 values: hashmap.values()) {
			if (values.getName().contains(text)) {
				System.out.println(values);
			}
		}
	}
}
