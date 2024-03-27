import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap<>();
		hashmap.put("f.e", "for example");
		hashmap.put("etc.", "and so on");
		hashmap.put("i.e", "more precisely");
		
		Program program = new Program();
		
		

		program.printKeys(hashmap);
		System.out.println("---");
		program.printKeysWhere(hashmap, "i");
		System.out.println("---");
		program.printValuesOfKeysWhere(hashmap, ".e");
	}
}
