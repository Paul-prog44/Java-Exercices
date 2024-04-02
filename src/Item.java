
public class Item {
	private String name;
	private int weight;
	
	public Item(String name) {
		this.name = name;
	}
	
	public Item(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	
	public String getName() {
		return this.name;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public String toString() {
		return this.name + " (" + this.weight + " kg)";
	}

	
	public boolean equals(Object comparedItem) {
		if (this == comparedItem ) {
			return true;
		}
		
		if (!(comparedItem instanceof Item)) {
			return false;
		}
		
		Item newComparedItem = (Item) comparedItem;
		if (this.name.equals(newComparedItem.name)) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
}
