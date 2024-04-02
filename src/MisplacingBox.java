import java.util.ArrayList;

public class MisplacingBox extends Box {
	ArrayList<Item> items;
	
	public MisplacingBox() {
		this.items = new ArrayList<>(); 
	}
	
	public void add(Item item) {
		this.items.add(item);
	}
	
	public boolean isInBox(Item item) {
		if (this.items.contains(item)) {
			return false;
		}
		return false;
	}
}
