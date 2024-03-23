import java.util.ArrayList;
public class SimpleCollection {
	private ArrayList<String> list;
	private String name;
	
	public SimpleCollection(String name) {
		this.name = name;
		this.list = new ArrayList<>() ;
	}
	
	public void add(String value) {
		this.list.add(value);
	}
	
	public String toString() {
		if (list.isEmpty()) {
			return "The collection "+ this.name + " is empty.";
		}
		
		if (list.size() == 1) {
			return "The collection "+ this.name +" has 1 element : \n" + list.get(0);
		}
		String values = "";
		for (String value: list) {
			values = values + value+ "\n";
		}
		
		return "The collection " + this.name +" has " + list.size() + " elements : \n" +
			values;
	}
	
	public String longest() {
		if (list.isEmpty()) {
			return null;
		}
		
		String string = list.get(0);
		for (String stringInList:list) {
			if (stringInList.length()> string.length()) {
				string = stringInList;
			}
		}
		
		return string;
	}
}
